package com.example.turningyourphone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Landscape or Portrait"

    val button = findViewById<Button>(R.id.button)
    val editTxt = findViewById<EditText>(R.id.editTextText2)
    val txtView = findViewById<TextView>(R.id.textView)


    button.setOnClickListener {
        txtView.text = editTxt.text.toString()
    }

    }
}