package com.example.exemplowhatsapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.exemplowhatsapp.R
import com.example.exemplowhatsapp.ui.model.ModelComunidades

class AdapterComunidades(val listaComunidades: ArrayList<ModelComunidades>): RecyclerView.Adapter<ComunidadesViewHolder>(){
    //returna o numero de animais na lista
    override fun getItemCount(): Int = listaComunidades.size

    // gera o item na wiew
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComunidadesViewHolder {
        return  ComunidadesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_comunidades, parent, false)
        )
    }
    //Liga cada registro na ArrayList a uma exibição
    override fun onBindViewHolder(holder: ComunidadesViewHolder, position: Int) {
        holder.nomeComunidade.text = listaComunidades[position].nomeComunidade

        if (listaComunidades[position].nova_comunidade){
            holder.layVerTodos.visibility = GONE
            holder.layAvisos.visibility = GONE
            holder.divisor.visibility = GONE
            holder.ic_add.visibility = VISIBLE
        }

        holder.dataAviso.text = listaComunidades[position].data
        holder.ultimaMensagem.text = listaComunidades[position].ultimoAviso
        holder.imgComunidade.setImageResource(listaComunidades[position].imageComunidade)

        holder.layVerTodos.setOnClickListener{
        }
    }
}

class ComunidadesViewHolder(view: View): RecyclerView.ViewHolder(view){
    val nomeComunidade = view.findViewById<TextView>(R.id.txNomeComunidade)
    val layVerTodos = view.findViewById<ConstraintLayout>(R.id.layoutVerTodos)
    val layAvisos = view.findViewById<ConstraintLayout>(R.id.layoutAvisoComunidade)
    val divisor = view.findViewById<View>(R.id.linhaDivisor)
    val ic_add = view.findViewById<ImageView>(R.id.imgAddComunidade)
    val dataAviso = view.findViewById<TextView>(R.id.txDataUltimoAviso)
    val ultimaMensagem = view.findViewById<TextView>(R.id.txUltimaMensagemAviso)
    val imgComunidade = view.findViewById<ImageView>(R.id.imgComunidade)

}
