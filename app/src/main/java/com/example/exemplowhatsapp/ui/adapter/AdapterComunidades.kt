package com.example.exemplowhatsapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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
        holder.nomeComunidade.text = listaComunidades[position].nomeContato

    }
}

class ComunidadesViewHolder(view: View): RecyclerView.ViewHolder(view){
    val nomeComunidade = view.findViewById<TextView>(R.id.txNomeComunidade)

}
