package com.wastedreflex

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_single_playground_2x2.*
import kotlin.random.Random

class single_playground_2x2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_playground_2x2)

        val leftUp_1 = 1.toString()
        val rightUp_2 = 2.toString()
        val leftDown_3 = 3.toString()
        val rightDown_4 = 4.toString()

        generateBtn.setOnClickListener {
            val randomBlock = (1..4).random()
            println(randomBlock)
            Toast.makeText(this@single_playground_2x2, randomBlock.toString(), Toast.LENGTH_SHORT).show()
        }


    }
}