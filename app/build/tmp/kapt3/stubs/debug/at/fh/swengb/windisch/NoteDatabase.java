package at.fh.swengb.windisch;

import java.lang.System;

@androidx.room.Database(entities = {at.fh.swengb.windisch.Note.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lat/fh/swengb/windisch/NoteDatabase;", "Landroidx/room/RoomDatabase;", "()V", "NoteDao", "Lat/fh/swengb/windisch/NoteDao;", "getNoteDao", "()Lat/fh/swengb/windisch/NoteDao;", "Companion", "app_debug"})
public abstract class NoteDatabase extends androidx.room.RoomDatabase {
    private static at.fh.swengb.windisch.NoteDatabase INSTANCE;
    public static final at.fh.swengb.windisch.NoteDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract at.fh.swengb.windisch.NoteDao getNoteDao();
    
    public NoteDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lat/fh/swengb/windisch/NoteDatabase$Companion;", "", "()V", "INSTANCE", "Lat/fh/swengb/windisch/NoteDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "getDatabase", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final at.fh.swengb.windisch.NoteDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final at.fh.swengb.windisch.NoteDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}