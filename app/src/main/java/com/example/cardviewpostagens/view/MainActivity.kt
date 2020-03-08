package com.example.cardviewpostagens.view

import Comentario
import com.example.cardviewpostagens.adapters.ComentariosAdapter
import Postagem
import PostagemAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cardviewpostagens.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Parte do Recyclerview para postagens
        val recyclerView = recyclerPostagem
        recyclerView.adapter = PostagemAdapter(prepararPostagens(),this)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager


        //Parte do Recyclerview para comentarios
        val recyclerViewComentario = recyclerviewComentarios
        recyclerViewComentario.adapter = ComentariosAdapter(preparaComentario(), this)
        val layoutManagerComentario = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewComentario.layoutManager = layoutManagerComentario

    }

    private fun prepararPostagens(): List<Postagem>{

        //Aqui poderia vir de um Banco de Dados ou da Net
        return listOf(
            Postagem("test1","test1",
                R.drawable.egito
            ),
            Postagem("test2","test2",
                R.drawable.paris
            ),
            Postagem("test3","test3",
                R.drawable.cruseiro
            ),
            Postagem("test4","test4",
                R.drawable.resort
            )
        )
    }

    private fun preparaComentario(): List<Comentario>{

        //Aqui poderia vir de um Banco de Dados ou da Net
        return listOf(
            Comentario("Comemtario teste 1 Comemtario teste 1 Comemtario teste 1 " +
                    "Comemtario teste 1 Comemtario teste 1 Comemtario teste 1 " +
                    "Comemtario teste 1 Comemtario teste 1 Comemtario teste 1 "),
            Comentario("Comemtario teste 2 Comemtario teste 2 Comemtario teste 2 " +
                    "Comemtario teste 2 Comemtario teste 2 Comemtario teste 2 " +
                    "Comemtario teste 2 Comemtario teste 2 Comemtario teste 2 "),
            Comentario("Comemtario teste 3 Comemtario teste 3 Comemtario teste 3 " +
                    "Comemtario teste 3 Comemtario teste 3 Comemtario teste 3 " +
                    "Comemtario teste 3 Comemtario teste 31 Comemtario teste 3 "),
            Comentario("Comemtario teste 1 Comemtario teste 1 Comemtario teste 1 " +
                    "Comemtario teste 1 Comemtario teste 1 Comemtario teste 1 " +
                    "Comemtario teste 1 Comemtario teste 1 Comemtario teste 1 "),
            Comentario("Comemtario teste 2 Comemtario teste 2 Comemtario teste 2 " +
                    "Comemtario teste 2 Comemtario teste 2 Comemtario teste 2 " +
                    "Comemtario teste 2 Comemtario teste 2 Comemtario teste 2 "),
            Comentario("Comemtario teste 3 Comemtario teste 3 Comemtario teste 3 " +
                    "Comemtario teste 3 Comemtario teste 3 Comemtario teste 3 " +
                    "Comemtario teste 3 Comemtario teste 31 Comemtario teste 3 "),
            Comentario("Comemtario teste 1 Comemtario teste 1 Comemtario teste 1 " +
                    "Comemtario teste 1 Comemtario teste 1 Comemtario teste 1 " +
                    "Comemtario teste 1 Comemtario teste 1 Comemtario teste 1 "),
            Comentario("Comemtario teste 2 Comemtario teste 2 Comemtario teste 2 " +
                    "Comemtario teste 2 Comemtario teste 2 Comemtario teste 2 " +
                    "Comemtario teste 2 Comemtario teste 2 Comemtario teste 2 "),
            Comentario("Comemtario teste 3 Comemtario teste 3 Comemtario teste 3 " +
                    "Comemtario teste 3 Comemtario teste 3 Comemtario teste 3 " +
                    "Comemtario teste 3 Comemtario teste 31 Comemtario teste 3 ")
        )
    }
}
