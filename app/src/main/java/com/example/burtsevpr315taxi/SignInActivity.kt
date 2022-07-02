package com.example.burtsevpr315taxi

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.burtsevpr315taxi.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSignIn.setOnClickListener {
            val login = binding.emailLogin.text.toString()
            val password = binding.passwordText.text.toString()

            if (Validate().onBlank(login, password)) {
                Toast.makeText(this, "Заполните поля", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val i = Intent(this, MapsActivity::class.java)
            this.startActivity(i)
        }

        binding.createNewAccount.setOnClickListener {
            val int = Intent(this, SignUpActivity::class.java)
            this.startActivity(int)
        }
    }
}