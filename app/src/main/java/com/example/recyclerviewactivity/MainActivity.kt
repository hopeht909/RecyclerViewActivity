package com.example.recyclerviewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var etName : EditText
    lateinit var etNum : EditText
    lateinit var etAge : EditText
    lateinit var etLocation : EditText

    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        etNum = findViewById(R.id.etNum)
        etAge = findViewById(R.id.etAge)
        etLocation = findViewById(R.id.etLocation)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this , MainActivity2::class.java)
             intent.putExtra("Name" , etName.text.toString())
             intent.putExtra("Num" , etNum.text.toString())
             intent.putExtra("Age" , etAge.text.toString())
             intent.putExtra("Location" , etLocation.text.toString())
            startActivity(intent)
        }

    }
}