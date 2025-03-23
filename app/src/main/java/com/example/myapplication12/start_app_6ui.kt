package com.example.myapplication12

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

class start_app_6ui : AppCompatActivity() {

    // Declare the views as properties
    private lateinit var radioOptionA: RadioButton
    private lateinit var radioOptionB: RadioButton
    private lateinit var radioOptionC: RadioButton
    private lateinit var radioOptionD: RadioButton
//    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Remove the title bar (must be called before setContentView)
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

        // Set up click listener for submit button
//

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
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