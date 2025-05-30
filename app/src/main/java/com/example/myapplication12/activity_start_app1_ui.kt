package com.example.myapplication12

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_start_app1_ui : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Remove the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Remove the status bar
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        hideNavigationBar()

        enableEdgeToEdge()
        setContentView(R.layout.activity_start_app1_ui)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var button7 = findViewById<Button>(R.id.button8)
        button7.setOnClickListener {
            val intent9 = Intent(this,start_app_2ui::class.java)
            startActivity(intent9)
        }

        var imageview25 = findViewById<ImageView>(R.id.imageView25)
        imageview25.setOnClickListener {
            val intent25 = Intent(this,notification_1ui::class.java)
            startActivity(intent25)
        }
        var imageview67 = findViewById<ImageView>(R.id.imageView67)
        imageview67.setOnClickListener {
            val intent25 = Intent(this,user_profile_ui::class.java)
            startActivity(intent25)
        }
        var imageview68 = findViewById<ImageView>(R.id.imageView68)
        imageview68.setOnClickListener {
            val intent25 = Intent(this,notification_1ui::class.java)
            startActivity(intent25)
        }
        var imageview66 = findViewById<ImageView>(R.id.imageView66)
        imageview66.setOnClickListener {
            val intent66 = Intent(this,start_app_2ui::class.java)
            startActivity(intent66)
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