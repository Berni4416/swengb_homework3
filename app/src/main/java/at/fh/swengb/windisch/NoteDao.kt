package at.fh.swengb.windisch

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(Note: Note)

    @Query("SELECT * FROM Note WHERE id = :note_id")
    fun findNoteId(note_id: String):Note

    @Query("SELECT * FROM Note")
    fun getNote():List<Note>

    @Query("DELETE FROM Note")
    fun deleteNote()
}