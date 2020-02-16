package at.fh.swengb.windisch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B(\u0012!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0014\u0010\u0018\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eR,\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lat/fh/swengb/windisch/NoteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lat/fh/swengb/windisch/NoteHolder;", "clickListener", "Lkotlin/Function1;", "Lat/fh/swengb/windisch/Note;", "Lkotlin/ParameterName;", "name", "note", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "noteList", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "app_debug"})
public final class NoteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<at.fh.swengb.windisch.NoteHolder> {
    private java.util.List<at.fh.swengb.windisch.Note> noteList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<at.fh.swengb.windisch.Note, kotlin.Unit> clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public at.fh.swengb.windisch.NoteHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<at.fh.swengb.windisch.Note> newList) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    at.fh.swengb.windisch.NoteHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<at.fh.swengb.windisch.Note, kotlin.Unit> getClickListener() {
        return null;
    }
    
    public NoteAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super at.fh.swengb.windisch.Note, kotlin.Unit> clickListener) {
        super();
    }
}