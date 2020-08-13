package com.wastedreflex

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_single_playground_2x2.*

class SinglePlayground2x2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_playground_2x2)


//Random generator gomb
        generateBtn.setOnClickListener {
//Random szam generalasa
            val randomBlock = (1..4).random()
            println(randomBlock)
            val randomTimer = (2000..4000).random()
            println(randomTimer)
            //Toast.makeText(this@SinglePlayground2x2, randomBlock.toString(), Toast.LENGTH_SHORT).show()
            //Thread.sleep(3000)
            //Toast.makeText(this@SinglePlayground2x2, randomTimer.toString(), Toast.LENGTH_SHORT).show()
//rendszer ido lekerese
            //val currentTimeStr = System.currentTimeMillis()
            //Toast.makeText(this@SinglePlayground2x2, currentTimeStr.toString(), Toast.LENGTH_SHORT).show()
//Timer
            val timer = object: CountDownTimer(5000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    Toast.makeText(this@SinglePlayground2x2, millisUntilFinished.toString(), Toast.LENGTH_SHORT).show()
                }

                override fun onFinish() {
                    Toast.makeText(this@SinglePlayground2x2, "VÉGE", Toast.LENGTH_SHORT).show()
                }
            }
            timer.start()
        }
    }
}