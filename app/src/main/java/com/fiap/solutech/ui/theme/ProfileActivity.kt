package com.fiap.solutech

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fiap.solutech.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Exibir informações do perfil
        binding.profileTextView.text = "Nome: Gabriel Melo\nEmail: gabriel@solutech.com"
    }
}
