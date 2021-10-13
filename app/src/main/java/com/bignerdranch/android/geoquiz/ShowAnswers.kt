package com.bignerdranch.android.geoquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


private lateinit var textview: TextView
private lateinit var back: Button


class ShowAnswers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_answers)
        textview = findViewById(R.id.header)
        back = findViewById(R.id.btnBack)
        back.setOnClickListener {  val i = Intent(this, MainActivity::class.java)
            startActivity(i) }
    }
}

