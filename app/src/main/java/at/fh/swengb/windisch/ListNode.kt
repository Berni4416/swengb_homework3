package at.fh.swengb.windisch

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_list_node.*
import java.util.*

class ListNode : AppCompatActivity() {
    companion object{
        val USER_TOKEN = "TOKEN"
        val LASTSYNC = "LASTSYNC"
        val NOTEID = "NOTEID"
        val EXTRA_ADDED_RESULT = 0
    }
    val noteAdapter = NoteAdapter(){
        val intent = Intent(this, AddNode::class.java)
        intent.putExtra(NOTEID, it.id)
        startActivityForResult(intent, EXTRA_ADDED_RESULT)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_node)

        val sharedPreferences = getSharedPreferences(packageName, Context.MODE_PRIVATE)
        val token = sharedPreferences.getString(USER_TOKEN, null)
        val lastSync = sharedPreferences.getLong(LASTSYNC, 0)
        if (token != null){
            NoteRepository.getNote(
                token,
                lastSync,
                success = {
                    it.notes.map { NoteRepository.addNote(this, it) }
                    sharedPreferences.edit().putLong(LASTSYNC, it.lastSync).apply()
                    noteAdapter.updateList(NoteRepository.getNoteall(this))
                },
                error = {
                    Log.e("Error", it)
                    noteAdapter.updateList(NoteRepository.getNoteall(this))
                })
            note_recycler_view.layoutManager = StaggeredGridLayoutManager(2,1)
            note_recycler_view.adapter = noteAdapter

        }
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item?.itemId) {
            R.id.logout -> {
                val sharedPreferences = getSharedPreferences(packageName, Context.MODE_PRIVATE)
                sharedPreferences.edit().clear().apply()
                NoteRepository.cleandb(this)
                finish()
                true}
            R.id.new_note -> {
                val uuidString = UUID.randomUUID().toString()
                val intent = Intent(this, AddNode::class.java)
                intent.putExtra(NOTEID, uuidString)
                startActivityForResult(intent, EXTRA_ADDED_RESULT)
                true}
            else -> super.onOptionsItemSelected(item)
        }
    }


    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        Log.e("ACTIVITY_R","RESULTED Activity")
        if (requestCode == EXTRA_ADDED_RESULT  && resultCode == Activity.RESULT_OK){
            noteAdapter.updateList(NoteRepository.getNoteall(this))
            note_recycler_view.layoutManager = StaggeredGridLayoutManager(2,1)
            note_recycler_view.adapter = noteAdapter
        }
    }
}
