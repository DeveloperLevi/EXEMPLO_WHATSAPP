package com.example.exemplowhatsapp.ui.model

import com.example.exemplowhatsapp.R


class ModelComunidades(
    val nomeComunidade: String = "" ,
    val ultimoAviso: String = "",
    val data: String = "",
    val nova_comunidade: Boolean = false,
    val imageComunidade: Int = 0){

    fun loadModelComunidades(): ArrayList<ModelComunidades> = arrayListOf(
        ModelComunidades("Nova Comunidade", "nome do filme -- jose maria", "10/10/2023",true,R.drawable.ic_nova_comunidade),
        ModelComunidades("REI DA BETS GRÁTIS", "~Suporte Larissa: Vamos Ganhar", "14:08",false, R.drawable.comunidade_1),
        ModelComunidades("Vendas Sem Estoque #7", "~Suporte Bigodinho: Chegou o Grande dia", "22/09/2023",false,R.drawable.comunidade_2),
        ModelComunidades("Nova Oportunidade #199", "~Danielle Rodrigues:", "30/08/2023",false,R.drawable.comunidade_3)
          )
}