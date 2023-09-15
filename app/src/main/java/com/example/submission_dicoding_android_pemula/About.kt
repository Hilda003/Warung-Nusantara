package com.example.submission_dicoding_android_pemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.submission_dicoding_android_pemula.databinding.ActivityAboutBinding
import com.example.submission_dicoding_android_pemula.databinding.ActivityDetailBinding

class About : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}