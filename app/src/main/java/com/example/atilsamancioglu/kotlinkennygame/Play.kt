package com.example.atilsamancioglu.kotlinkennygame

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class Play : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

    }
    fun playGame(view: View) {

    val intent = Intent(applicationContext,MainActivity::class.java)
    startActivity(intent)
    }
}


