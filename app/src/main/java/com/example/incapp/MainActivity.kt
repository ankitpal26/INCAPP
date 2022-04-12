package com.example.incapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.incapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.plus.setOnClickListener {
            count++
            binding.inputNo.text=count.toString()

                     }
        binding.reset.setOnClickListener {
            count =0
            binding.inputNo.text=count.toString()
        }
    }


}