package at.fh.swengb.windisch

import android.content.Context
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object NoteRepository {

    fun getNote(token: String, lastSync: Long, success:(noteResponse: NotesResponse)->Unit,error:(errorMessage:String)->Unit){
        NoteApi.retrofitService.notes(token, lastSync).enqueue(object : Callback<NotesResponse>{

            override fun onFailure(call: Call<NotesResponse>, t: Throwable) {
                error("Call failed")
            }

            override fun onResponse(call: Call<NotesResponse>, response: Response<NotesResponse>) {
                val responseBody = response.body()
                if (response.isSuccessful && responseBody != null) {
                    success(responseBody)
                } else {
                    error("There is something wrong")
                }
            }
        })
    }

    fun uploadNode (token: String, note2Upload: Note, success: (note: Note)->Unit, error: (errorMessage: String)->Unit){
        NoteApi.retrofitService.addOrUpdateNote(token, note2Upload).enqueue(object : Callback<Note>{

            override fun onFailure(call: Call<Note>, t: Throwable) {
                error("Call failed! " + t.localizedMessage)
            }

            override fun onResponse(call: Call<Note>, response: Response<Note>) {
                val responseBody = response.body()
                if (response.isSuccessful && responseBody != null) {
                    success(responseBody)
                } else {
                    error("There is something wrong " + response.message())
                }
            }
        })
    }

    fun addNote(context: Context, newNote: Note) {
        val db = NoteDatabase.getDatabase(context)
        db.NoteDao.insert(newNote)
    }

    fun getNoteByid (context: Context, id: String):Note {
        val db = NoteDatabase.getDatabase(context)
        return db.NoteDao.findNoteId(id)
    }

    fun getNoteall (context: Context):List<Note> {
        val db = NoteDatabase.getDatabase(context)
        return db.NoteDao.getNote()
    }

    fun cleandb (context: Context) {
        val db = NoteDatabase.getDatabase(context)
        return db.NoteDao.deleteNote()
    }
}