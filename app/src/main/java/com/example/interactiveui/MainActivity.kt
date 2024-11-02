package com.example.interactiveui

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnDark=findViewById<Button>(R.id.button)
        val btnLight=findViewById<Button>(R.id.button2)
        val layout = findViewById<ConstraintLayout>(R.id.main)
        btnLight.setOnClickListener{
            layout.setBackgroundResource(R.color.Read)

        }
        btnDark.setOnClickListener{
            layout.setBackgroundResource(R.color.black)
        }

    }
}