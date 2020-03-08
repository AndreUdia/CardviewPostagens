package com.example.cardviewpostagens

import Postagem
import PostagemAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.postagem_item.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = recyclerPostagem



        recyclerView.adapter = PostagemAdapter(prepararPostagens(),this)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = layoutManager
    }

    private fun prepararPostagens(): List<Postagem>{

        //Aqui poderia vir de um Banco de Dados ou da Net
        return listOf(
            Postagem("test1","test1", R.drawable.egito),
            Postagem("test2","test2", R.drawable.paris),
            Postagem("test3","test3", R.drawable.cruseiro),
            Postagem("test4","test4", R.drawable.resort)
        )
    }
}
