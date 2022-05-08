package com.example.sihproject.screens.slash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sihproject.screens.MainActivity
import com.example.sihproject.R
import java.util.*
import kotlin.concurrent.timerTask

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        Timer().schedule(
       timerTask {
           val intent=Intent(this@SplashScreen, MainActivity::class.java)
           startActivity(intent)
           finish()
       }, 1000L)
    }
}

// TODO 1: Add a condition to check if user is logged in or not
// TODO 2: Add user login screen