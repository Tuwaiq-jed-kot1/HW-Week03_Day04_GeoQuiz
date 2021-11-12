package com.bignerdranch.android.geoquiz

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class DisplayActivity : AppCompatActivity() {
    private lateinit var list: ListView

    private val quizViewModel: QuizViewModel by lazy {
        ViewModelProvider(this).get(QuizViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
        list = findViewById(R.id.listview)
        list.adapter = ListViewAdapter(this,quizViewModel.questionBank)
    }
}

class ListViewAdapter(private val context: Context,private val list: List<Question>) : BaseAdapter() {

    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.listview_item, parent, false)
        val questionTextView = rowView.findViewById(R.id.question) as TextView
        val answerTextView = rowView.findViewById(R.id.Answer) as TextView
        questionTextView.setText(list[position].textResId)
        answerTextView.text = list[position].answer.toString()

    return rowView
    }



}
