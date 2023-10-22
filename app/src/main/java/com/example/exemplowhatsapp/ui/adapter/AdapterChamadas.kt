package com.example.exemplowhatsapp.ui.adapter

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface.DEFAULT
import android.graphics.Typeface.DEFAULT_BOLD
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import androidx.recyclerview.widget.RecyclerView
import com.example.exemplowhatsapp.R
import com.example.exemplowhatsapp.ui.activity.FotoPerfilActivity
import com.example.exemplowhatsapp.ui.model.ModelChamadas

class AdapterChamadas(val ctx: Context, val listaChamadas:ArrayList<ModelChamadas>): RecyclerView.Adapter<ChamadasViewHolder>(){
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
        holder.dataChamada.text = listaChamadas[position].data

        holder.imgContato.setOnClickListener{// esse click abre a foto do perfil
            val intent =  Intent(ctx, FotoPerfilActivity::class.java).apply {
                putExtra("imagemID", listaChamadas[position].imgContaoChamada)
                putExtra("nomeContato",listaChamadas[position].nomeContato )
            }
            val activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(ctx, R.anim.fade_in_act_foto_perfil, 0)

            ContextCompat.startActivity(ctx, intent, activityOptionsCompat.toBundle())
        }

        if (listaChamadas[position].novaChamada){
            holder.imgContato.setBackgroundColor(getColor(ctx, R.color.background_float_buttons_color))
            holder.dataChamada.text = "Faça uma chamada para um ou mais de seus contatos"
            holder.txRecentes.visibility = VISIBLE
            holder.imgTipoChamada.visibility = GONE
            holder.cardTipoChamada.visibility = GONE
            holder.imgContato.scaleType = ImageView.ScaleType.CENTER
            holder.nome.typeface = DEFAULT_BOLD
        } else{
            holder.nome.typeface = DEFAULT
        }

        if (listaChamadas[position].novaChamada == false) {
            holder.imgContato.setImageResource(listaChamadas[position].imgContaoChamada)
        }

        if (listaChamadas[position].chamadaRecebida == false){
            holder.nome.setTextColor( Color.RED)
            holder.setaChamada.setColorFilter( Color.RED)
            holder.setaChamada.rotation = 0f
        }else{
            holder.setaChamada.rotation = 180f
            holder.setaChamada.setColorFilter( Color.GREEN)
        }

        if (listaChamadas[position].tipoChamada == 0){
            holder.imgTipoChamada.setImageResource(R.drawable.foto_perfil_chamada)
        } else if (listaChamadas[position].tipoChamada == 1){
            holder.imgTipoChamada.setImageResource(R.drawable.foto_perfil_video)
        }
    }
}

class ChamadasViewHolder(view: View): RecyclerView.ViewHolder(view){
    val nome = view.findViewById<TextView>(R.id.txNomeContatoChamadas)
    val imgContato = view.findViewById<ImageView>(R.id.imgContatoChamada)
    val dataChamada = view.findViewById<TextView>(R.id.txUltimaMensagemChamadas)
    val txRecentes = view.findViewById<TextView>(R.id.txRecente)
    val imgTipoChamada = view.findViewById<ImageView>(R.id.imgTipoChamada)
    val cardTipoChamada = view.findViewById<CardView>(R.id.cardTipoChamada)
    val setaChamada = view.findViewById<ImageView>(R.id.imgSetaChamada)

}
