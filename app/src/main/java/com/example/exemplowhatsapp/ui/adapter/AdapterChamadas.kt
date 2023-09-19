package com.example.exemplowhatsapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exemplowhatsapp.R
import com.example.exemplowhatsapp.ui.model.ModelChamadas

class AdapterChamadas(val listaChamadas:ArrayList<ModelChamadas>): RecyclerView.Adapter<ChamadasViewHolder>(){
    //returna o numero de animais na lista
    override fun getItemCount(): Int = listaChamadas.size

    // gera o item na wiew
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChamadasViewHolder {
        return  ChamadasViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_chamadas, parent, false)
        )
    }

    //Liga cada registro na ArrayList a uma exibição
    override fun onBindViewHolder(holder: ChamadasViewHolder, position: Int) {
        holder.nome.text = listaChamadas[position].nomeContato
    }
}

class ChamadasViewHolder(view: View): RecyclerView.ViewHolder(view){
    val nome = view.findViewById<TextView>(R.id.txNomeContatoChamadas)

}
