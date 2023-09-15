package com.example.submission_dicoding_android_pemula

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper


@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        supportActionBar?.hide()

        //Start the main activity
        Handler(Looper.getMainLooper()).postDelayed({
            val splashIntent = Intent(this@SplashScreenActivity, MainActivity::class.java)
            startActivity(splashIntent)
            finish()
        }, 2000)

    }
}