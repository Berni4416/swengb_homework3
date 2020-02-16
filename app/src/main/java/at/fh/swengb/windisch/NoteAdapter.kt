package at.fh.swengb.windisch

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_node.view.*

class NoteAdapter(val clickListener: (note: Note) -> Unit): RecyclerView.Adapter<NoteHolder>() {

    private var noteList = listOf<Note>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteHolder {
        val inflater = LayoutInflater.from(parent.context)
        val noteItemView = inflater.inflate(R.layout.item_node, parent, false)
        return NoteHolder(noteItemView, clickListener)
    }

    override fun getItemCount(): Int {
        return noteList.count()
    }

    fun updateList(newList: List<Note>) {
        noteList = newList
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: NoteHolder, position: Int) {
        holder.bindItem(noteList[position])
    }
}

class NoteHolder(itemView: View, val clickListener: (note: Note) -> Unit): RecyclerView.ViewHolder(itemView) {
    fun bindItem(note: Note) {
        itemView.item_title.text = note.title
        itemView.item_content.text = note.text


        itemView.setOnClickListener{
            clickListener(note)
        }
    }
}