package com.example.myapplication12

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class start_app_8ui : AppCompatActivity() {
    private lateinit var radioOptionA: RadioButton
    private lateinit var radioOptionB: RadioButton
    private lateinit var radioOptionC: RadioButton
    private lateinit var radioOptionD: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        // Remove the status bar
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        enableEdgeToEdge()
        hideNavigationBar()

        setContentView(R.layout.activity_start_app6ui)

        // Initialize the views
        radioOptionA = findViewById(R.id.radioOptionA)
        radioOptionB = findViewById(R.id.radioOptionB)
        radioOptionC = findViewById(R.id.radioOptionC)
        radioOptionD = findViewById(R.id.radioOptionD)
//        submitButton = findViewById(R.id.submitButton) // Make sure you have this button in your layout

        // Pre-select option B as correct answer if        submitButton.setOnClickListener {
        ////            when {
        ////                radioOptionA.isChecked -> {
        ////                    // Handle selection of option A
        ////                }
        ////                radioOptionB.isChecked -> {
        ////                    // Correct answer
        ////                }
        ////                radioOptionC.isChecked -> {
        ////                    // Handle selection of option C
        ////                }
        ////                radioOptionD.isChecked -> {
        ////                    // Handle selection of option D
        ////                }
        ////            }
        ////        } needed
        radioOptionB.isChecked = true
        enableEdgeToEdge()
        setContentView(R.layout.activity_start_app8ui)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var button17 = findViewById<Button>(R.id.button26)
        button17.setOnClickListener {
            val intent18 = Intent(this,start_app_7ui::class.java)
            startActivity(intent18)
        }

        var button18 = findViewById<Button>(R.id.button25)
        button18.setOnClickListener {
            val intent19 = Intent(this,start_app_9ui::class.java)
            startActivity(intent19)
        }


    }
    private fun hideNavigationBar() {
        val decorView = window.decorView
        val uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                View.SYSTEM_UI_FLAG_FULLSCREEN
        decorView.systemUiVisibility = uiOptions
    }
}