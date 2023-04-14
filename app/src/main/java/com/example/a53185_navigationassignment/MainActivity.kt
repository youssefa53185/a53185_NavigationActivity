package com.example.a53185_navigationassignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            callActivity()
        }

    }

    private fun callActivity() {

        val editText = findViewById<EditText>(R.id.EditText)
        val message = editText.text.toString()

        Intent(this,MainActivity2::class.java).also {
            it.putExtra("Extra_Message", message)
            startActivity(it)
        }

    }
}