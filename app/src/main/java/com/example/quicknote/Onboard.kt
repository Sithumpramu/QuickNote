package com.example.quicknote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Onboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)

        var startbutton = findViewById<Button>(R.id.buttonstart)

        startbutton.setOnClickListener{
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)

        }

        var tologinbutton = findViewById<TextView>(R.id.haveaccount)

        tologinbutton .setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)

        }


    }
}