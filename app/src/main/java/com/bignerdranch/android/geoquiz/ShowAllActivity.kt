package com.bignerdranch.android.geoquiz

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class ShowAllActivity : AppCompatActivity() {
    private lateinit var mainLayout: LinearLayout
    private val quizViewModel: QuizViewModel by lazy {
        ViewModelProvider(this).get(QuizViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_all)
        mainLayout = findViewById(R.id.mainLayout)
        showAnswers()

    }
    private fun showAnswers() {
        val myList = quizViewModel.getQuestionBank()
        myList.forEachIndexed { index, question ->
            createTextViewAndAddToMainLayout("Question ($index) : ${getString(question.textResId)}",false)
            createTextViewAndAddToMainLayout("\nAnswer ($index) :${question.answer}\n",true)
        }
    }
    private fun createTextViewAndAddToMainLayout(text : String,centered : Boolean) {
        val myTextView = TextView(this)
        myTextView.textSize = 15f
        myTextView.text = text
        if (centered)
        myTextView.gravity = Gravity.CENTER
        mainLayout.addView(myTextView)
    }

    companion object {
        fun newIntent(packageContext: Context): Intent {
            return Intent(packageContext,ShowAllActivity::class.java)
        }
    }
}