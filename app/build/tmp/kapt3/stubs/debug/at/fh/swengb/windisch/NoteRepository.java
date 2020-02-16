package at.fh.swengb.windisch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\\\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00040\u00102!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00040\u0010J\u0016\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\fJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u0005\u001a\u00020\u0006J\\\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00040\u00102!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00040\u0010\u00a8\u0006\u001e"}, d2 = {"Lat/fh/swengb/windisch/NoteRepository;", "", "()V", "addNote", "", "context", "Landroid/content/Context;", "newNote", "Lat/fh/swengb/windisch/Note;", "cleandb", "getNote", "token", "", "lastSync", "", "success", "Lkotlin/Function1;", "Lat/fh/swengb/windisch/NotesResponse;", "Lkotlin/ParameterName;", "name", "noteResponse", "error", "errorMessage", "getNoteByid", "id", "getNoteall", "", "uploadNode", "note2Upload", "note", "app_debug"})
public final class NoteRepository {
    public static final at.fh.swengb.windisch.NoteRepository INSTANCE = null;
    
    public final void getNote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, long lastSync, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super at.fh.swengb.windisch.NotesResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> error) {
    }
    
    public final void uploadNode(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    at.fh.swengb.windisch.Note note2Upload, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super at.fh.swengb.windisch.Note, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> error) {
    }
    
    public final void addNote(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    at.fh.swengb.windisch.Note newNote) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final at.fh.swengb.windisch.Note getNoteByid(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<at.fh.swengb.windisch.Note> getNoteall(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void cleandb(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private NoteRepository() {
        super();
    }
}