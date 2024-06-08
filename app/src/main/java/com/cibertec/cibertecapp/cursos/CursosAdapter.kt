package com.cibertec.cibertecapp.cursos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CursosAdapter(val list: List<cursos>) : RecyclerView.Adapter<CursosViewHolder>()

{
    //Instanciar el viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CursosViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CursosViewHolder(inflater, parent)
    }

    //Indica el numero de elementos a mostrar
    override fun getItemCount(): Int {
        return list.size
    }

    //Asignar datos al ViewHolder
    override fun onBindViewHolder(holder: CursosViewHolder, position: Int) {
        val cursos = list[position]
        holder.bind(cursos)
    }
}