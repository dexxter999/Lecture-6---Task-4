package com.example.introductionscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.introductionscreen.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonNext.setOnClickListener {
            Snackbar.make(binding.root, "Clicked on button next!", Snackbar.LENGTH_SHORT).show()
        }

        binding.buttonBack.setOnClickListener {
            Snackbar.make(binding.root, "Clicked on button back!", Snackbar.LENGTH_SHORT).show()
        }

    }
}