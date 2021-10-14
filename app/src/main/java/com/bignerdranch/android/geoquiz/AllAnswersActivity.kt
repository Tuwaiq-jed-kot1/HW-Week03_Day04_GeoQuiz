package com.bignerdranch.android.geoquiz

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.StringRes

private const val EXTRA_ANSWERS = "Answers_Bank"

class AllAnswersActivity : AppCompatActivity() {
    private lateinit var answerTextView: TextView
    private var answers = "umm sorry"

    companion object {
        fun newIntent(packageContext: Context, answers: String): Intent {

            return Intent(packageContext, AllAnswersActivity::class.java).apply {
                putExtra(EXTRA_ANSWERS, answers)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_answers)
        answers = intent.getStringExtra(EXTRA_ANSWERS)!!

        answerTextView = findViewById(R.id.answer_text_view)
        answerTextView.text = answers

    }
}