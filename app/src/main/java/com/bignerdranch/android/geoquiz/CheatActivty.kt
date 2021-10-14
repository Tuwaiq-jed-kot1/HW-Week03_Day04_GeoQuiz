package com.bignerdranch.android.geoquiz

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private const val EXTRA_ANSWER_IS_TRUE=  "com.bignerdranch.android.geoquiz.answer_is_true"
    const val EXTRA_ANSWER_SHOWN = "com.bignerdranch.android.geoquiz.answer_shown"
class
CheatActivty : AppCompatActivity() {
    private var answearIsTrue=false
    private lateinit var answerTextView: TextView
    private lateinit var showAnswerButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cheat_activty)
        answearIsTrue=intent.getBooleanExtra(EXTRA_ANSWER_IS_TRUE,false)
        answerTextView=findViewById(R.id.answer_text_view)
        showAnswerButton=findViewById(R.id.show_answer_button)
showAnswerButton.setOnClickListener {
    val answerText = when {
        answearIsTrue -> R.string.true_button
        else -> R.string.false_button
    }
    answerTextView.setText(answerText)
    }
        private fun setAnswerShownResult(isAnswerShown: Boolean) {
            val data = Intent().apply {
                putExtra((EXTRA_ANSWER_SHOWN, isAnswerShown)
            }
            setResult(Activity.RESULT_OK, data)
        }


        companion object {
            fun newIntent(packageContext: Context, answerIsTrue: Boolean): Intent{
                return Intent(packageContext, CheatActivty::class.java).apply {
                    putExtra(EXTRA_ANSWER_IS_TRUE, answerIsTrue)
                }
            }
        }
}