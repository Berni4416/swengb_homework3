package at.fh.swengb.windisch;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\'\u00a8\u0006\f"}, d2 = {"Lat/fh/swengb/windisch/NoteDao;", "", "deleteNote", "", "findNoteId", "Lat/fh/swengb/windisch/Note;", "note_id", "", "getNote", "", "insert", "Note", "app_debug"})
public abstract interface NoteDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    at.fh.swengb.windisch.Note Note);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Note WHERE id = :note_id")
    public abstract at.fh.swengb.windisch.Note findNoteId(@org.jetbrains.annotations.NotNull()
    java.lang.String note_id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Note")
    public abstract java.util.List<at.fh.swengb.windisch.Note> getNote();
    
    @androidx.room.Query(value = "DELETE FROM Note")
    public abstract void deleteNote();
}