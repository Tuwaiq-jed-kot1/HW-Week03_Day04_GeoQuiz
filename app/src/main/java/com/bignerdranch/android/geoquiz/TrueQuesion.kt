package com.bignerdranch.android.geoquiz

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val EXTRA_QUESTION_IS_TRUE =
    "com.bignerdranch.android.geoquiz.question_is_true"
class trueQuesion :  AppCompatActivity()  {
 private  var trueQuesion = false
   private lateinit var showButtont: TextView
   private lateinit var buttonC :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cheat)
        trueQuesion = intent.getBooleanExtra(EXTRA_QUESTION_IS_TRUE, false)

    }
          override fun ct() {

          }


    companion object {
        fun tQ(packageContext: Context, trueQuesion: Unit) : Intent {
            return Intent(packageContext, trueQuesion::class.java).apply {
                (EXTRA_ANSWER_SHOWN)

            }
        }
    }
}