package com.example.burtsevpr315taxi

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.burtsevpr315taxi.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            val login = binding.email.text ?: ""
            val password = binding.your.text ?: ""
            val password2 = binding.repeat.text ?: ""

            if (login.isBlank() || password.isBlank() || password2.isBlank()) {
                Toast.makeText(this, "Заполните поля", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password != password2) {
                Toast.makeText(this, "Пароли не совпадают", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val i = Intent(this, MapsActivity::class.java)
            this.startActivity(i)
        }
    }
}