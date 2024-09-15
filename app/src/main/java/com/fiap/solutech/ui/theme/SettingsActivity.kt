package com.fiap.solutech

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fiap.solutech.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurações
        binding.notificationsSwitch.setOnCheckedChangeListener { _, isChecked ->
            binding.notificationsTextView.text = if (isChecked) "Notificações Ativadas" else "Notificações Desativadas"
        }
    }
}
