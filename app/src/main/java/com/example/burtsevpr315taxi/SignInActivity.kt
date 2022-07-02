package com.example.burtsevpr315taxi

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.burtsevpr315taxi.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        binding = ActivitySignInBinding.inflate(layoutInflater)

        binding.buttonSignIn.setOnClickListener {
            val login = binding.emailLogin.text ?: ""
            val password = binding.passwordText.text ?: ""

            if (login.isBlank() || password.isBlank()) {
                Log.d(TAG, "onCreate: asdf")
                Toast.makeText(this, "Заполните поля", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val i = Intent(this, MapsActivity::class.java)
            this.startActivity(i)
        }

        binding.createNewAccount.setOnClickListener {
            val int: Intent = Intent(this, SignUpActivity::class.java)
            this.startActivity(int)
        }
    }
}