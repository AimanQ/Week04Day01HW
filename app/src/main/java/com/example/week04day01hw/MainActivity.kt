package com.example.week04day01hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var editTextName:EditText?= null
    private var editTextAge:EditText?= null
    private var editTextHeight:EditText?= null
    private var buttonOpenSecond:Button?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()
        openSecondActivity()
    }
    private fun connectViews(){
        editTextName = findViewById(R.id.etName)
        editTextAge = findViewById(R.id.etAge)
        editTextHeight = findViewById(R.id.etHeight)
        buttonOpenSecond = findViewById(R.id.btnOpenSecondActivity)
    }
    private fun openSecondActivity(){
        buttonOpenSecond?.setOnClickListener {
            val textName = editTextName?.text.toString()
            val textAge = editTextAge?.text.toString()
            val textHeight = editTextHeight?.text.toString()

            val i = Intent(this,SecondActivity::class.java)
            i.putExtra("name",textName)
            i.putExtra("age",textAge)
            i.putExtra("h",textHeight)
            startActivity(i)
        }


    }
}