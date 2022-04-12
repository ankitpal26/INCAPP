package com.example.incapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.incapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.plus.setOnClickListener { incrementOne() }
        binding.reset.setOnClickListener { resetWzero() }
    }

    private fun resetWzero() {
        TODO("Not yet implemented")
        val stringInTextField = binding.InputNo.text.toString()
        val cost = stringInTextField.toDouble()
        var incement = stringInTextField+1....
    }

    private fun incrementOne() {
        TODO("Not yet implemented")
        val stringInTextField = binding.InputNo.text.toString()
        val cost = stringInTextField.toDouble()

    }

}