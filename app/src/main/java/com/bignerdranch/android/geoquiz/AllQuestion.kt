package com.bignerdranch.android.geoquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


private lateinit var _allQuestion:TextView
class AllQuestion : AppCompatActivity() {


        private lateinit var textview: TextView
        private lateinit var btnBack:Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_all_question)

            textview = findViewById(R.id.textView)
            btnBack = findViewById(R.id.button)

            btnBack.setOnClickListener {  val i = Intent(this, MainActivity::class.java)
                startActivity(i) }

            textview = findViewById( R . id . textView )
            val numberList = intent .getSerializableExtra( "key" )
            textview. text = numberList .toString()
        }
    }
