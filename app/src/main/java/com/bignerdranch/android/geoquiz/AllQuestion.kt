package com.bignerdranch.android.geoquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


private lateinit var _allQuestion:TextView
class AllQuestion : AppCompatActivity() {


        private lateinit var _textview: TextView
        private lateinit var btnBack:Button
    private val quizViewModel = QuizViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_all_question)


            btnBack = findViewById(R.id.button)

            btnBack.setOnClickListener {  val i = Intent(this, MainActivity::class.java)
                startActivity(i) }



        var numberQ=1
            _textview = findViewById(R.id.textView)
            val all_Question = quizViewModel.allQuestion()
            var space=""
            for (i in all_Question)
                space += "Q${numberQ++} : ${getString(i.textResId)}  -->: ${i.answer}\n\n"


            _textview.text = space
        }
    }
