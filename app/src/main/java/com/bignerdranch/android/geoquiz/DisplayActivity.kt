package com.bignerdranch.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    private lateinit var displayQ: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)


        displayQ = findViewById(R.id.textView)
        displayQ = findViewById(R.id.textView2)
        displayQ = findViewById(R.id.textView3)
        displayQ = findViewById(R.id.textView4)
        displayQ = findViewById(R.id.textView5)
        displayQ = findViewById(R.id.textView6)

    }
}