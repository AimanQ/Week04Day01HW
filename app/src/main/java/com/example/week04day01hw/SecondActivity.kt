package com.example.week04day01hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class SecondActivity : AppCompatActivity() {

    private var editTextName:EditText?= null
    private var editTextAge:EditText?= null
    private var editTextHeight:EditText?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        connectViews()
        receiveData()
    }
    private fun connectViews(){
        editTextName = findViewById(R.id.etName)
        editTextAge = findViewById(R.id.etAge)
        editTextHeight = findViewById(R.id.etHeight)
    }
    private fun receiveData(){
        val i = intent

        val textName = i.getStringExtra("name")
        val textAge = i.getStringExtra("age")
        val textHeight = i.getStringExtra("h")

        editTextName?.setText(textName)
        editTextAge?.setText(textAge)
        editTextHeight?.setText(textHeight)
    }
}