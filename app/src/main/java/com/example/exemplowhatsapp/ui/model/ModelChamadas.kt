package com.example.exemplowhatsapp.ui.model

import com.example.exemplowhatsapp.R


class ModelChamadas(
    val nomeContato: String = "" ,
    val ultimaMensagem: String = "",
    val data: String = "",
    val novaChamada: Boolean = false,
    val tipoChamada: Int = 0,
    val imgContaoChamada: Int = 0,
    val chamadaRecebida: Boolean = true){

    fun loadModelChamadas(): ArrayList<ModelChamadas> = arrayListOf(
        ModelChamadas("Nova chamada", "Faça uma chamada para um ou mais de seus contatos", "10/10/2023", true, R.drawable.ic_chamadas_add_round),
        ModelChamadas("FAGNER_DAVI_IMPORTADOS", "deixe marcado pra segunda", "17 de outubro 09:35",false, 0, R.drawable.chamada_2),
        ModelChamadas("Santa Corba", "nome do filme -- jose maria", "17 de outubro 09:28", false,1, R.drawable.chamada_1),
        ModelChamadas("gedean P M A Moveis", "deixe marcado pra segunda", "17 de outubro 09:22",false, 0,R.drawable.chamada_4),
        ModelChamadas("FAGNER_DAVI_IMPORTADOS", "nome do filme -- jose maria", "17 de outubro 09:00", false, 0,R.drawable.chamada_2, false),
        ModelChamadas("gedean P M A Moveis", "deixe marcado pra segunda", "16 de outubro 18:04", false,1,R.drawable.chamada_4),
        ModelChamadas("gedean P M A Moveis(2)", "nome do filme -- jose maria", "16 de outubro 17:57",false,0, R.drawable.chamada_4, false ),
        ModelChamadas("gedean P M A Moveis", "deixe marcado pra segunda", "16 de outubro 17:04",false,0,R.drawable.chamada_4),
        ModelChamadas("Socorro Contadora", "nome do filme -- jose maria", "16 de outubro 10:17",false,0,R.drawable.chamada_3,false) )
}