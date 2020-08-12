package com.wastedreflex

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_single_playground_2x2.*

class SinglePlayground2x2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_playground_2x2)



        generateBtn.setOnClickListener {
            val randomBlock = (1..4).random()
            println(randomBlock)
            val randomTimer = (2000..4000).random()
            Toast.makeText(this@SinglePlayground2x2, randomBlock.toString(), Toast.LENGTH_SHORT).show()
        }


    }
}