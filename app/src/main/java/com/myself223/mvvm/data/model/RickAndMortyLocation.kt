package com.myself223.mvvm.data.model

import android.media.Image
import com.google.gson.annotations.SerializedName

data class RickAndMortyLocation (
    @SerializedName("name")
    val nameLocation :String,
    val url: String,
    val image: String
)
