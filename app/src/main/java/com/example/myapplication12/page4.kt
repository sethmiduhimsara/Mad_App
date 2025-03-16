package com.example.myapplication12

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Remove the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Remove the status bar
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        enableEdgeToEdge()
        setContentView(R.layout.activity_page4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent5 = Intent(this, page5_login::class.java)
            startActivity(intent5)
        }

        val button4 = findViewById<Button>(R.id.button5)
        button4.setOnClickListener {
            val intent6 = Intent(this, page6_register::class.java)
            startActivity(intent6)
        }

    }
}