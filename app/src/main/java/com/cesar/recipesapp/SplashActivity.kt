package com.cesar.recipesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val btnStart:Button=findViewById(R.id.btnGetStarted)
        btnStart.setOnClickListener {
            var intent=Intent(this@SplashActivity,HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}