package com.example.game2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
          val start = findViewById<ImageView>(R.id.Start)

        start.setOnClickListener() {
            val gama = Intent(this, Gome::class.java)
            startActivity(gama)
            finish()
        }
    }
}