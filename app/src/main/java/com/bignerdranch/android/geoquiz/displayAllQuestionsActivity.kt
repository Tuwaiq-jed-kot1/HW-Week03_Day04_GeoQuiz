package com.bignerdranch.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class displayAllQuestionsActivity : AppCompatActivity() {
    private lateinit var AllQuestionTextView: TextView
    private val quizViewModel = QuizViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_all_questions)

        AllQuestionTextView = findViewById(R.id.tvAllQ)
        val allQL = quizViewModel.displayAllQ()
        var t = ""
        for (i in allQL)
            t += "Q : ${getString(i.textResId)}  Ans: ${i.answer}\n"
        println(t)
        AllQuestionTextView.text = t

    }

}