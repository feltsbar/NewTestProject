package com.example.newtestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.hello_button).setOnClickListener {
            Toast.makeText(this, "Hello everyone!", Toast.LENGTH_SHORT).show()
        }
    }
}