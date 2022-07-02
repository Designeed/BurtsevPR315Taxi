package com.example.burtsevpr315taxi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.burtsevpr315taxi.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMapsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageOption.setOnClickListener {
            binding.linearLayout.visibility = if (binding.linearLayout.visibility == View.GONE) View.VISIBLE else View.GONE
        }
    }
}