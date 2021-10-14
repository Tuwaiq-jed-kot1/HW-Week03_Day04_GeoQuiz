package com.bignerdranch.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class ShowAnswers : AppCompatActivity() {
    private lateinit var allAnswers: TextView
    private val quizViewModel: QuizViewModel by lazy {
        ViewModelProvider(this).get(QuizViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_answers)

        allAnswers=findViewById(R.id.all_answers)
//       val strList : ArrayList<String> = intent.getStringArrayListExtra(getString(R.string.SHOW_ALL))


   val answers =intent.getStringArrayListExtra(getString(R.string.SHOW_ALL))

       var str =""
       for(i in 0 .. answers!!.size-1) {
           var splitby=answers.get(i).split(",")
           str +="Q${i+1}: ${splitby[0]} \n (${splitby[1]}) \n \n"
        }
        allAnswers.text= str
    }


}