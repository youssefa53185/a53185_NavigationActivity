package com.example.a53185_navigationassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val message = intent.getStringExtra("Extra_Message")

        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}