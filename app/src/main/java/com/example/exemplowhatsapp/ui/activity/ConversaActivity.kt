package com.example.exemplowhatsapp.ui.activity

import android.graphics.PorterDuff.Mode
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.exemplowhatsapp.databinding.ActivityConversaBinding

class ConversaActivity : AppCompatActivity() {
    lateinit var  binding: ActivityConversaBinding
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConversaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgPerfilConversa.setImageResource(intent.getIntExtra("imagemID",0))
        binding.txNomeContatoConversa.text = intent.getStringExtra("nomeContato")

        supportActionBar?.hide()

        if (getResources().configuration.isNightModeActive){ // VERIFICA SE O ANDROID ESTA USANDO O TEMA ESCURO
            binding.layouActivityConversa.backgroundTintMode = Mode.SRC_IN
        }else{
            binding.layouActivityConversa.backgroundTintMode = Mode.ADD
        }
    }

    fun voltarClick(view: View){
        this.finish()
    }

}