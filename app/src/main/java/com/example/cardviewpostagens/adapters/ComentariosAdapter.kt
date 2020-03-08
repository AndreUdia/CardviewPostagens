package com.example.cardviewpostagens.adapters

import Comentario
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cardviewpostagens.R
import kotlinx.android.synthetic.main.item_comentario.view.*

class ComentariosAdapter(private val comentarios: List<Comentario>,
                         private val context: Context
) : RecyclerView.Adapter<ComentariosAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val comentario = comentarios[position]
        holder.bindView(comentario)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_comentario, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return comentarios.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(comentario: Comentario) {
            val comentarioView = itemView.texto_comentario

            comentarioView.text = comentario.comentario

        }

    }

}