package com.example.myapplication12
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class start_app_4ui : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Remove the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Remove the status bar
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

        hideNavigationBar()

        enableEdgeToEdge()
        setContentView(R.layout.activity_start_app4ui)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var button13 = findViewById<Button>(R.id.button21)
        button13.setOnClickListener {
            val intent14 = Intent(this,start_app_3ui::class.java)
            startActivity(intent14)
        }

        var button14 = findViewById<Button>(R.id.button18)
        button14.setOnClickListener {
            val intent15 = Intent(this,start_app_5ui::class.java)
            startActivity(intent15)
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