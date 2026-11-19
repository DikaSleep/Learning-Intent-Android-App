package com.example.myintentapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myintentapp.databinding.ActivityMainBinding
import com.example.myintentapp.databinding.ActivityMoveBinding

class MoveActivity : AppCompatActivity() {

    companion object {

        const val name = "name"
        const val age = "age"
    }
    lateinit var binding: ActivityMoveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra(name)
        val age = intent.getIntExtra(age, 0)

        val text = "Nama Dia $nama Dan Berumur $age"

        binding.tvDataReceived.text = text

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}