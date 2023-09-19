package com.example.exemplowhatsapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.exemplowhatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //esconder a action bar da activity
        supportActionBar?.hide()


        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_conversas,
                R.id.navigation_status,
                R.id.navigation_comunidades,
                R.id.navigation_chamadas
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.navView.setupWithNavController(navController)
    }

    fun clickMenu  (view: View){
        Toast.makeText(this, "testando 123", Toast.LENGTH_SHORT).show()
    }
}