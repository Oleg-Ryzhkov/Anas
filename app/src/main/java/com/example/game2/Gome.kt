package com.example.game2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class Gome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gome)
        val img = findViewById<ImageView>(R.id.img)
        val img1 = findViewById<ImageView>(R.id.img1)
        val img2 = findViewById<ImageView>(R.id.img2)
        val img3 = findViewById<ImageView>(R.id.img3)
        val img4 = findViewById<ImageView>(R.id.img4)
        val img5 = findViewById<ImageView>(R.id.img5)
        val img6 = findViewById<ImageView>(R.id.img6)
        val img7 = findViewById<ImageView>(R.id.img7)
        val img8 = findViewById<ImageView>(R.id.img8)
        val Score = findViewById<TextView>(R.id.textView)
        val Gome = findViewById<TextView>(R.id.Gome)
var int = 0
val speed = 500
        val Hand = 1000
        val randomdrawable = arrayOf( 0, 1, 2, 3, 4, 5, 6, 7, 8)

        val drawable = arrayOf(R.drawable.anas, R.drawable.anas, R.drawable.anas,R.drawable.anas,R.drawable.anas,R.drawable.anas,R.drawable.no,R.drawable.no,R.drawable.no)
        fun stop() {
            img.isEnabled = false
            img1.isEnabled = false
            img2.isEnabled = false
            img3.isEnabled = false
            img4.isEnabled = false
            img5.isEnabled = false
            img6.isEnabled = false
            img7.isEnabled = false
            img8.isEnabled = false
        }

        fun startgome() {
            stop()
            randomdrawable.shuffle()
            img.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                img.setImageResource(drawable[randomdrawable[0]])
                img.animate().rotationY(180f).setDuration(speed.toLong()).withEndAction() {
                    Handler().postDelayed({
                        img.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                            img.setImageResource(R.drawable.sho)
                            img.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction() {
                                img.isEnabled = true
                            }
                        }
                    }, Hand.toLong())
                }
            }

            img1.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                img1.setImageResource(drawable[randomdrawable[1]])
                img1.animate().rotationY(180f).setDuration(speed.toLong()).withEndAction() {
                    Handler().postDelayed({
                        img1.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                            img1.setImageResource(R.drawable.sho)
                            img1.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction() {
                                img1.isEnabled = true
                            }
                        }
                    }, Hand.toLong())
                }
            }
            img2.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                img2.setImageResource(drawable[randomdrawable[2]])
                img2.animate().rotationY(180f).setDuration(speed.toLong()).withEndAction() {
                    Handler().postDelayed({
                        img2.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                            img2.setImageResource(R.drawable.sho)
                            img2.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction() {
                                img2.isEnabled = true
                            }
                        }
                    }, Hand.toLong())
                }
            }
            img3.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                img3.setImageResource(drawable[randomdrawable[3]])
                img3.animate().rotationY(180f).setDuration(speed.toLong()).withEndAction() {
                    Handler().postDelayed({
                        img3.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                            img3.setImageResource(R.drawable.sho)
                            img3.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction() {
                                img3.isEnabled = true
                            }
                        }
                    }, Hand.toLong())
                }
            }
            img4.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                img4.setImageResource(drawable[randomdrawable[4]])
                img4.animate().rotationY(180f).setDuration(speed.toLong()).withEndAction() {
                    Handler().postDelayed({
                        img4.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                            img4.setImageResource(R.drawable.sho)
                            img4.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction() {
                                img4.isEnabled = true
                            }
                        }
                    }, Hand.toLong())
                }
            }
            img5.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                img5.setImageResource(drawable[randomdrawable[5]])
                img5.animate().rotationY(180f).setDuration(speed.toLong()).withEndAction() {
                    Handler().postDelayed({
                        img5.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                            img5.setImageResource(R.drawable.sho)
                            img5.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction() {
                                img5.isEnabled = true
                            }
                        }
                    }, Hand.toLong())
                }
            }
            img6.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                img6.setImageResource(drawable[randomdrawable[6]])
                img6.animate().rotationY(180f).setDuration(speed.toLong()).withEndAction() {
                    Handler().postDelayed({
                        img6.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                            img6.setImageResource(R.drawable.sho)
                            img6.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction() {
                                img6.isEnabled = true
                            }
                        }
                    }, Hand.toLong())
                }
            }
            img7.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                img7.setImageResource(drawable[randomdrawable[7]])
                img7.animate().rotationY(180f).setDuration(speed.toLong()).withEndAction() {
                    Handler().postDelayed({
                        img7.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                            img7.setImageResource(R.drawable.sho)
                            img7.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction() {
                                img7.isEnabled = true
                            }
                        }
                    }, Hand.toLong())
                }
            }
            img8.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                img8.setImageResource(drawable[randomdrawable[8]])
                img8.animate().rotationY(180f).setDuration(speed.toLong()).withEndAction() {
                    Handler().postDelayed({
                        img8.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction() {
                            img8.setImageResource(R.drawable.sho)
                            img8.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction() {
                                img8.isEnabled = true
                            }
                        }
                    }, Hand.toLong())
                }
            }
        }

        startgome()
        fun newgome() {
            if ((int % 6 == 0) && (int > 2))  {
                Gome.text = "Good"
                stop()
                Handler().postDelayed({
                    startgome()
                }, Hand.toLong())

            }
        }
        val Finish = Intent(this, Finish::class.java)
        fun gameower(){
            Gome.text = "Gameover"
            stop()

            Handler().postDelayed({
                Finish.putExtra("int", "" + int);
                startActivity(Finish)
                finish()
            },2000)
        }


img.setOnClickListener(){
    img.isEnabled = false
    if (randomdrawable[0] >= 6) {
        gameower()
    }
    else
        int++
    Score.text = "Score: "+ int
    img.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction(){
        img.setImageResource(drawable[randomdrawable[0]])
        img.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction(){
            newgome()
        }
    }
}
        img1.setOnClickListener(){
            img1.isEnabled = false
            if (randomdrawable[1] >= 6) {
                gameower()
            }
            else
                int++
            Score.text = "Score: "+ int
            img1.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction(){
                img1.setImageResource(drawable[randomdrawable[1]])
                img1.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction(){
                    newgome()
                }
            }
        }
        img2.setOnClickListener(){
            img2.isEnabled = false
            if (randomdrawable[2] >= 6) {
                gameower()
            }
            else
            int++
            Score.text = "Score: "+ int
            img2.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction(){
                img2.setImageResource(drawable[randomdrawable[2]])
                img2.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction(){
                    newgome()
                }
            }
        }
        img3.setOnClickListener(){
            img3.isEnabled = false
            if (randomdrawable[3] >= 6) {
                gameower()
            }
            else
                int++
            Score.text = "Score: "+ int
            img3.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction(){
                img3.setImageResource(drawable[randomdrawable[3]])
                img3.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction(){
                    newgome()
                }
            }
        }
        img4.setOnClickListener(){
            img4.isEnabled = false
            if (randomdrawable[4] >= 6) {
                gameower()
            }
            else
                int++
            Score.text = "Score: "+ int
            img4.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction(){
                img4.setImageResource(drawable[randomdrawable[4]])
                img4.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction(){
                    newgome()
                }
            }
        }
        img5.setOnClickListener(){
            img5.isEnabled = false
            if (randomdrawable[5] >= 6) {
                gameower()
            }
            else
                int++
            Score.text = "Score: "+ int
            img5.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction(){
                img5.setImageResource(drawable[randomdrawable[5]])
                img5.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction(){
                    newgome()
                }
            }
        }
        img6.setOnClickListener(){
            img6.isEnabled = false
            if (randomdrawable[6] >= 6) {
                gameower()
            }
            else
                int++
            Score.text = "Score: "+ int
            img6.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction(){
                img6.setImageResource(drawable[randomdrawable[6]])
                img6.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction(){
                    newgome()
                }
            }
        }
        img7.setOnClickListener(){
            img7.isEnabled = false
            if (randomdrawable[7] >= 6) {
                gameower()
            }
            else
                int++
            Score.text = "Score: "+ int
            img7.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction(){
                img7.setImageResource(drawable[randomdrawable[7]])
                img7.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction(){
                    newgome()
                }
            }
        }
        img8.setOnClickListener(){
            img8.isEnabled = false
            if (randomdrawable[8] >= 6) {
                gameower()
            }
            else
                int++
            Score.text = "Score: "+ int
            img8.animate().rotationY(90f).setDuration(speed.toLong()).withEndAction(){
                img8.setImageResource(drawable[randomdrawable[8]])
                img8.animate().rotationY(0f).setDuration(speed.toLong()).withEndAction(){
                    newgome()
                }
            }
        }
    }
}