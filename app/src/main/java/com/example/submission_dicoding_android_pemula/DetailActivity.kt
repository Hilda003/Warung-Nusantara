package com.example.submission_dicoding_android_pemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submission_dicoding_android_pemula.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.title = "Detail Food"
        }
        actionBar?.setDisplayHomeAsUpEnabled(true)


        val nameFood = intent.getStringExtra(EXTRA_NAME)
        val rateFood = intent.getStringExtra(EXTRA_RATE)
        val descriptionFood = intent.getStringExtra(EXTRA_DESCRIPTION)
        val imageFood = intent.getIntExtra(EXTRA_IMAGE, 0)


        binding.tvName.text = nameFood
        binding.tvRate.text = rateFood
        binding.tvDesc.text = descriptionFood
        Glide.with(this)
            .load(imageFood)
            .apply(RequestOptions())
            .into(binding.imgFood)


        binding.actionShare.setOnClickListener{
            val intent= Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, nameFood)
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share"))
        }





    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_RATE = "extra_rate"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }


}