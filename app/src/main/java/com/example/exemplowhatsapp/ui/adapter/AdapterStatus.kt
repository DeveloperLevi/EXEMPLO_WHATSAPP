package com.example.exemplowhatsapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exemplowhatsapp.R
import com.example.exemplowhatsapp.ui.model.ModelStatus

class AdapterStatus(val listaStatus: ArrayList<ModelStatus>): RecyclerView.Adapter<StatusViewHolder>(){
    //returna o numero de animais na lista
    override fun getItemCount(): Int = listaStatus.size

    // gera o item na wiew
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusViewHolder {
        return  StatusViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_status, parent, false)
        )
    }
    //Liga cada registro na ArrayList a uma exibição
    override fun onBindViewHolder(holder: StatusViewHolder, position: Int) {
        holder.nomeContato.text = listaStatus[position].nomeContato
        holder.imgContato.setImageResource(listaStatus[position].ImagemPerfil)
        holder.tempoPostagem.text = listaStatus[position].data

        if (listaStatus[position].meuStatus) {
            holder.captionStatus.visibility = VISIBLE
            holder.atualizacoesRecentes.visibility = VISIBLE
        }

    }
}

class StatusViewHolder(view: View): RecyclerView.ViewHolder(view){
    val nomeContato = view.findViewById<TextView>(R.id.txNomeContatoStatus)
    val imgContato = view.findViewById<ImageView>(R.id.imgFotoStatus)
    val tempoPostagem = view.findViewById<TextView>(R.id.txDataPostagemStatus)
    val captionStatus = view.findViewById<TextView>(R.id.txStatus)
    val atualizacoesRecentes = view.findViewById<TextView>(R.id.txAtualizacoesRecentes)


}
