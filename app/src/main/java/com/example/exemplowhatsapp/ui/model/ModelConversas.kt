package com.example.exemplowhatsapp.ui.model

import com.example.exemplowhatsapp.R


class ModelConversas(
    val nomeContato: String = "" ,
    val ultimaMensagem: String = "",
    val data: String = "",
    val ImagemPerfil: Int = 0){

    fun loadModelConversas(): ArrayList<ModelConversas> = arrayListOf(
        ModelConversas("Meus Arquivos", "nome do filme -- jose maria", "Ontem", R.drawable.contato_1),
        ModelConversas("Amigos do Drop9 e PRL", "deixe marcado pra segunda", "08:48", R.drawable.contato_2),
        ModelConversas("Mae", "nome do filme -- jose maria", "Ontem", R.drawable.contato_3),
        ModelConversas("Keven", "deixe marcado pra segunda", "20/09/2023", R.drawable.contato_4),
        ModelConversas("Marcelo Linhares", "nome do filme -- jose maria", "Ontem", R.drawable.contato_5),
        ModelConversas("Keuly", "deixe marcado pra segunda", "18/09/2023", R.drawable.contato_6),
        ModelConversas("Familia dos meus sonhos", "nome do filme -- jose maria", "Ontem", R.drawable.contato_7),
        ModelConversas("Wilson", "deixe marcado pra segunda", "Ontem", R.drawable.contato_8),
        ModelConversas("Welton Oliveira Welton Baterias", "nome do filme -- jose maria", "Ontem", R.drawable.contato_9),
        ModelConversas("W.S Tech Soluções em Info", "deixe marcado pra segunda", "Ontem", R.drawable.contato_10),
        ModelConversas("Ligia Motoclinik", "nome do filme -- jose maria", "Ontem", R.drawable.contato_11),
        ModelConversas("+55 88 8122-8122", "deixe marcado pra segunda", "07/09/2023", R.drawable.contato_12),
        ModelConversas("TJ Construção Loja", "nome do filme -- jose maria", "Ontem", R.drawable.contato_13),
        ModelConversas("Theogenes T J Construções", "deixe marcado pra segunda", "20/09/2023", R.drawable.contato_14),
        ModelConversas("Joab Dantas Wstech", "nome do filme -- jose maria", "21/10/2023", R.drawable.contato_15),
        ModelConversas("Paulo Peças", "deixe marcado pra segunda", "Ontem", R.drawable.contato_16),
        ModelConversas("Irandir Mombaça", "nome do filme -- jose maria", "18/10/2023", R.drawable.contato_17),
        ModelConversas("Mikael Motopecas", "deixe marcado pra segunda", "18/09/2023", R.drawable.contato_18),
        ModelConversas("THIAGO VIEIRA Mv E Pdv", "nome do filme -- jose maria", "10/10/2023", R.drawable.contato_19),
        ModelConversas("Laene Motoclinik", "deixe marcado pra segunda", "07/09/2023", R.drawable.contato_20),
        )
}