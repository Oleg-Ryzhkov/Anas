package com.example.game2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Startscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startscreen)

        Handler().postDelayed({
            val mainact = Intent(this, Main::class.java)
            startActivity(mainact)
            finish()
        },3000)




    }

}