package at.fh.swengb.windisch

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_node.*

class AddNode : AppCompatActivity() {

    companion object {
        val EXTRA_ADDED_RESULT = "ADD_RESULT"
        val USER_TOKEN = "TOKEN"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_node)

        val extra: String? = intent.getStringExtra(ListNode.NOTEID)

        if(extra != null){
            val note:Note? = NoteRepository.getNoteByid(this, extra)
            if(note != null) {
                add_title.setText(note.title)
                add_content.setText(note.text)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.note_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item?.itemId) {
            R.id.savenotes -> {

                val extra: String? = intent.getStringExtra(ListNode.NOTEID)
                val sharedPreferences = getSharedPreferences(packageName, Context.MODE_PRIVATE)
                val token = sharedPreferences.getString(USER_TOKEN, null)

                if (
                    (extra != null) &&
                    (add_content.text.toString().isNotEmpty() || add_title.text.toString().isNotEmpty()) &&
                    (token != null))
                {
                    val note = Note(extra, add_title.text.toString(), add_content.text.toString(), true)
                    NoteRepository.addNote(this, note)
                    NoteRepository.uploadNode(
                        token,
                        note,
                        success = {
                            NoteRepository.addNote(this, it)
                        },
                        error = {
                            Log.e("Upload", it)
                        })

                    val resultIntent = intent
                    resultIntent.putExtra(EXTRA_ADDED_RESULT, "ADDED")
                    Log.e("ADD_NOTE", "Added note")
                    setResult(Activity.RESULT_OK, resultIntent)
                    finish()
                }
                else {
                    Toast.makeText(this, this.getString(R.string.fill_message), Toast.LENGTH_SHORT).show()
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
