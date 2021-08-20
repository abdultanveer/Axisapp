package com.abdul.axisapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.abdul.axisapp.database.DbAccessObj

class MainActivity : AppCompatActivity() {
    lateinit var titleEt: EditText
    lateinit var subTitle: EditText
    lateinit var resultTv: TextView
    lateinit var dao: DbAccessObj

    override fun onCreate(savedInstanceState: Bundle?) { //when you fireup the app
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        titleEt = findViewById(R.id.etTitle)
        subTitle = findViewById(R.id.etSubtitle)
        resultTv = findViewById(R.id.tvResult)
        dao = DbAccessObj(this)
        dao.openDb()
    }

    fun saveDb(view: View) {       //click the button
        var titleString = titleEt.text.toString()
        var subTitleString = subTitle.text.toString()
        dao.createRow(titleString,subTitleString)
        titleEt.setText("")
        subTitle.setText("")
        resultTv.text = titleString
    }
}