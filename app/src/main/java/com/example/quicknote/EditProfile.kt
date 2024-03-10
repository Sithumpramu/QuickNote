package com.example.quicknote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        var backbutton = findViewById<ImageView>(R.id.imageback)

        backbutton.setOnClickListener{
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)

        }

        var updatebutton = findViewById<Button>(R.id.updatebutton)

        updatebutton.setOnClickListener{
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)

        }

        var deleteaccountbutton = findViewById<Button>(R.id.deletebutton)

        deleteaccountbutton .setOnClickListener{
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
    }
}