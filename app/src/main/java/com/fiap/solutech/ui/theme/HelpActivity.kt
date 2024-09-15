package com.fiap.solutech

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fiap.solutech.databinding.ActivityHelpBinding

class HelpActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHelpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Conteúdo de ajuda
        binding.helpTextView.text = "Para suporte, entre em contato via email: suporte@solutech.com"
    }
}
