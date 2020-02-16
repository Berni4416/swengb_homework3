package at.fh.swengb.windisch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\nH\'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lat/fh/swengb/windisch/NoteApiService;", "", "addOrUpdateNote", "Lretrofit2/Call;", "Lat/fh/swengb/windisch/Note;", "accessToken", "", "body", "login", "Lat/fh/swengb/windisch/AuthResponse;", "Lat/fh/swengb/windisch/AuthRequest;", "notes", "Lat/fh/swengb/windisch/NotesResponse;", "lastSync", "", "app_debug"})
public abstract interface NoteApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/notes")
    public abstract retrofit2.Call<at.fh.swengb.windisch.NotesResponse> notes(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "access-token")
    java.lang.String accessToken, @retrofit2.http.Header(value = "last-sync")
    long lastSync);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/login")
    public abstract retrofit2.Call<at.fh.swengb.windisch.AuthResponse> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    at.fh.swengb.windisch.AuthRequest body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/notes")
    public abstract retrofit2.Call<at.fh.swengb.windisch.Note> addOrUpdateNote(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "access-token")
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    at.fh.swengb.windisch.Note body);
}