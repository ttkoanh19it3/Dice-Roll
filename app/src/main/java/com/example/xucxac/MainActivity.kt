package com.example.xucxac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)
        val rollButton: Button = this.findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            rollDice2()
            rollDice3()
            Result()
        }



    }

    fun Result() {
        val resultTextView: TextView = this.findViewById(R.id.ketqua)
        val resultTextView2: TextView = this.findViewById(R.id.ketqua2)
        val resultTextView3: TextView = this.findViewById(R.id.ketqua3)
        val resultTextViewmain: TextView = this.findViewById(R.id.resultmain)
        val n1 = resultTextView.text.toString().toInt()
        val n2 = resultTextView2.text.toString().toInt()
        val n3 = resultTextView3.text.toString().toInt()
        val nmain = n1+n2+n3
        resultTextViewmain.text = nmain.toString()

    }


    fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = this.findViewById(R.id.imageView)
        val resultTextView: TextView = this.findViewById(R.id.ketqua)
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = "$diceRoll"
        resultTextView.text = diceRoll.toString()
    }

    fun rollDice2() {
        val dice = Dice(6)
        val diceRoll2 = dice.roll()
        val resultTextView: TextView = this.findViewById(R.id.ketqua2)
        val diceImage: ImageView = this.findViewById(R.id.imageView2)
        val drawableResource = when (diceRoll2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = "$diceRoll2"
        resultTextView.text = diceRoll2.toString()

    }

    fun rollDice3() {
        val dice = Dice(6)
        val diceRoll3 = dice.roll()
        val resultTextView: TextView = this.findViewById(R.id.ketqua3)
        val diceImage: ImageView = this.findViewById(R.id.imageView3)
        val drawableResource = when (diceRoll3) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = "$diceRoll3"
        resultTextView.text = diceRoll3.toString()
    }


    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..this.numSides).random()

        }
    }
}

