package com.example.exemplowhatsapp.ui.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.ActivityOptionsCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.exemplowhatsapp.R
import com.example.exemplowhatsapp.ui.activity.ConversaActivity
import com.example.exemplowhatsapp.ui.activity.FotoPerfilActivity
import com.example.exemplowhatsapp.ui.model.ModelConversas

class AdapterConversas(val ctx: Context, val listaConversas: ArrayList<ModelConversas>): RecyclerView.Adapter<ConversasViewHolder>(){

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
        holder.imgContato.setImageResource(listaConversas[position].ImagemPerfil)
        holder.dataUltimaMensagem.text = listaConversas[position].data

       holder.imgContato.setOnClickListener{// esse click abre a foto do perfil
            val intent =  Intent(ctx, FotoPerfilActivity::class.java).apply {
                putExtra("imagemID", listaConversas[position].ImagemPerfil )
                putExtra("nomeContato",listaConversas[position].nomeContato )
            }
            val activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(ctx, R.anim.fade_in_act_foto_perfil, 0)

            startActivity( ctx, intent, activityOptionsCompat.toBundle() )
        }

        holder.card.setOnClickListener{// esse click chama a activity conversas
            val intent =  Intent(ctx, ConversaActivity::class.java).apply {
                putExtra("imagemID", listaConversas[position].ImagemPerfil )
                putExtra("nomeContato",listaConversas[position].nomeContato )
            }
            startActivity( ctx, intent,null)
        }

    }
}

class ConversasViewHolder(view: View): RecyclerView.ViewHolder(view){
    val nomeContato = view.findViewById<TextView>(R.id.txNomeContato)
    val imgContato =view.findViewById<ImageView>(R.id.imgContato)
    val dataUltimaMensagem = view.findViewById<TextView>(R.id.txData)
    val card = view.findViewById<ConstraintLayout>(R.id.layout_card_conversas)
}
