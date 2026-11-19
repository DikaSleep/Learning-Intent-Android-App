package com.example.myintentapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myintentapp.databinding.ActivityMoveBinding
import com.example.myintentapp.databinding.ActivityMainBinding
import com.example.myintentapp.databinding.ActivityCreteBinding

class CreateActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}