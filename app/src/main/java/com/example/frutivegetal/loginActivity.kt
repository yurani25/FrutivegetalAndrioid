package com.example.frutivegetal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            // Implementa el código para el proceso de inicio de sesión aquí
        }
    }
}