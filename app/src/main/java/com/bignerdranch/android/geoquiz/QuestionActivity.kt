package com.bignerdranch.android.geoquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class QuestionActivity : AppCompatActivity() {

    private lateinit var textview: TextView
    private lateinit var back: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        textview = findViewById(R.id.header)
        back = findViewById(R.id.btnBack)

        //textview.text = intent.getStringExtra(getString(R.string.header1))
        back.setOnClickListener {  val i = Intent(this, MainActivity::class.java)
            startActivity(i) }
    }
}