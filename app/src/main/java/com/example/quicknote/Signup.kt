package com.example.quicknote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        var createbutton = findViewById<Button>(R.id.buttonsignup)

        createbutton.setOnClickListener{
            val intent = Intent(this, LandingPage::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        var tologinbutton = findViewById<TextView>(R.id.haveaccount)

        tologinbutton .setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)

        }


    }
}