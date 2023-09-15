package com.example.submission_dicoding_android_pemula

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class FoodData(
    val image: Int = 0,
    val name: String,
    val rate: String,
    val description: String,
) : Parcelable
