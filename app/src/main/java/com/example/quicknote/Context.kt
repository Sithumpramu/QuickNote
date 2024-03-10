package com.example.quicknote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Context : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)

        var editbutton = findViewById<Button>(R.id.button2)

        editbutton.setOnClickListener{
            val intent = Intent(this, Createnote::class.java)
            startActivity(intent)

        }

        var menubutton = findViewById<ImageView>(R.id.imagemenu)

        menubutton.setOnClickListener{
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)

        }

        var updatebutton = findViewById<TextView>(R.id.textView2)

        updatebutton.setOnClickListener{
            val intent = Intent(this, Createnote::class.java)
            startActivity(intent)

        }
    }
}