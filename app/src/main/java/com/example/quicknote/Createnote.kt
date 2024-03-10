package com.example.quicknote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Createnote : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createnote)

        var backbutton = findViewById<ImageView>(R.id.imageback)

        backbutton.setOnClickListener{
            val intent = Intent(this, Context::class.java)
            startActivity(intent)

        }
    }
}