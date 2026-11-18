package com.example.myintentapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myintentapp.databinding.ActivityMainBinding
import androidx.core.net.toUri

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMove.setOnClickListener {
            val moveintent = Intent(this@MainActivity, MoveActivity::class.java)
            startActivity(moveintent)
        }

        binding.btnBrowser.setOnClickListener {
            val url = "https://www.google.com"

            val intent = Intent(
                Intent.ACTION_VIEW,
                url.toUri()
            )

            startActivity(intent)
        }

        binding.btnPhone.setOnClickListener {
            val number = "085828076905"

            val intent = Intent(Intent.ACTION_DIAL, "TLP$number".toUri())
            startActivity(intent)
        }

        binding.btnMap.setOnClickListener {
            val location = "Monas Jakarta"

            val intent = Intent(Intent.ACTION_VIEW, "LOCATION = $location".toUri())
            startActivity(intent)
        }

        binding.btnTeks.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "Halo, ini aplikasi saya!")
            }

            startActivity(Intent.createChooser(intent, "Bagikan melalui"))
        }

        binding.btnEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = "mailto:example@gmail.com".toUri()
                putExtra(Intent.EXTRA_SUBJECT, "Halo")
            }

            startActivity(intent)
        }

    }
}