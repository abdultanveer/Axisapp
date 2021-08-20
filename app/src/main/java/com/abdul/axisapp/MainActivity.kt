package com.abdul.axisapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var titleEt: EditText
    lateinit var resultTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        titleEt = findViewById(R.id.etTitle)
        resultTv = findViewById(R.id.tvResult)
    }

    fun saveDb(view: View) {
        var dataString = titleEt.text.toString()
        resultTv.text = dataString
    }
}