package com.cibertec.cibertecapp.cursos


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R

class CursosActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cursos)

        val recycleCursos = findViewById<RecyclerView>(R.id.recycleCursos)

        val listCursos = listOf<cursos>(
            cursos("Registro", R.drawable.registro),
            cursos("Historial", R.drawable.historial)
        )

        val adapter = CursosAdapter(listCursos)
        recycleCursos.adapter = adapter
        recycleCursos.layoutManager = LinearLayoutManager(this)
    }
}