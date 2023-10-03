package com.example.exemplowhatsapp.ui.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.exemplowhatsapp.R
import com.example.exemplowhatsapp.databinding.ActivityFotoPerfilBinding

class FotoPerfilActivity : AppCompatActivity() {
    lateinit var binding: ActivityFotoPerfilBinding
    var int = 10


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFotoPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val img: Int =  intent.getIntExtra("imagemID",0)
        val nomeContato = intent.getStringExtra("nomeContato")

        binding.imgVisualizaFotoPerfil.setImageResource( img )
        binding.txNomeContatoFotoPerfil.text = nomeContato
    }

    fun teste (v: View){
    // window.setGravity(Gravity.TOP + int)
    window.exitTransition

    }


    override fun finish() {
        super.finish()
       // overrideActivityTransition(OVERRIDE_TRANSITION_CLOSE,0, R.anim.fade_out_act_foto_perfil)

       overridePendingTransition(0, R.anim.fade_out_act_foto_perfil)

   }



}