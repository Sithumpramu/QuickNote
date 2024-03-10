package com.example.quicknote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var backbutton = findViewById<ImageView>(R.id.imageback)

        backbutton.setOnClickListener{
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)

        }

        var profilebutton = findViewById<ImageView>(R.id.editprofile)

        profilebutton.setOnClickListener{
            val intent = Intent(this, EditProfile::class.java)
            startActivity(intent)

        }

        var logoutbutton = findViewById<ImageView>(R.id.logout)

        logoutbutton.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)

        }
    }
}