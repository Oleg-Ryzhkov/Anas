package com.example.game2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class Finish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val arguments = intent.extras
        val odo = arguments!!["int"].toString()
        val textore = findViewById<TextView>(R.id.Texta)
        val anas = findViewById<ImageView>(R.id.imageView)
        fun Anas() {
            anas.animate().rotationY(3600f).setDuration(10000).withEndAction() {
                anas.animate().rotationY(0f).setDuration(10000).withEndAction() {
                    Anas()
                }
            }
        }
        Anas()
         Log.e("sasa", "$odo")
        textore.text = "Score: $odo"

        anas.setOnClickListener(){
            val gama = Intent(this, Gome::class.java)
            startActivity(gama)
            finish()
        }

    }
}