package com.example.exemplowhatsapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exemplowhatsapp.R
import com.example.exemplowhatsapp.ui.model.ModelConversas

class AdapterConversas(val listaConversas: ArrayList<ModelConversas>): RecyclerView.Adapter<ConversasViewHolder>(){
    //returna o numero de animais na lista
    override fun getItemCount(): Int = listaConversas.size

    // gera o item na wiew
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversasViewHolder {
        return  ConversasViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_conversas, parent, false)
        )
    }
    //Liga cada registro na ArrayList a uma exibição
    override fun onBindViewHolder(holder: ConversasViewHolder, position: Int) {
        holder.nomeContato.text = listaConversas[position].nomeContato
    }
}

class ConversasViewHolder(view: View): RecyclerView.ViewHolder(view){
    val nomeContato = view.findViewById<TextView>(R.id.txNomeContato)
}
