package com.example.exemplowhatsapp.ui.model

import com.example.exemplowhatsapp.R


class ModelStatus(
    val nomeContato: String = "",
    val ultimaMensagem: String = "",
    val data: String = "",
    val ImagemPerfil: Int = 0,
    val meuStatus: Boolean = false){

    fun loadModelStatus(): ArrayList<ModelStatus> = arrayListOf(
        ModelStatus("Meus Status", "nome do filme -- jose maria", "Ontem", R.drawable.contato_12,true),
        ModelStatus("Keven", "deixe marcado pra segunda", "há 3 minutos", R.drawable.contato_4),
        ModelStatus("Keuly", "deixe marcado pra segunda", "há 3 minutos", R.drawable.contato_6),
        ModelStatus("Wilson", "deixe marcado pra segunda", "há 11 minutos", R.drawable.contato_8),
        ModelStatus("W.S Tech Soluções em Info", "deixe marcado pra segunda", "há 38 minutos", R.drawable.contato_10),
        ModelStatus("Theogenes T J Construções", "deixe marcado pra segunda", "06:23", R.drawable.contato_14),
        ModelStatus("Joab Dantas Wstech", "nome do filme -- jose maria", "Ontem", R.drawable.contato_15),
        ModelStatus("Irandir Mombaça", "nome do filme -- jose maria", "Ontem", R.drawable.contato_17),
        ModelStatus("Mikael Motopecas", "deixe marcado pra segunda", "Ontem", R.drawable.contato_18),
        ModelStatus("Laene Motoclinik", "deixe marcado pra segunda", "Ontem", R.drawable.contato_20),
    )
}