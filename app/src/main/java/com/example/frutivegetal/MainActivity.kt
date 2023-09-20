package com.example.frutivegetal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.frutivegetal.adapter.itemAdapter
import com.example.frutivegetal.data.Datasource

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     // val myDataset = Datasource().loadAffirmations()

       //val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

      //recyclerView.adapter = itemAdapter(this, myDataset)

      // recyclerView.setHasFixedSize(true)
        val registerButton = findViewById<Button>(R.id.registerMainButton)
        val loginButton = findViewById<Button>(R.id.loginMainButton)

        registerButton.setOnClickListener {
            val intent = Intent(this, registerActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            val intent = Intent(this, imagenesActivity::class.java)
            startActivity(intent)
        }
    }


}

