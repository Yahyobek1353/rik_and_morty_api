package com.myself223.mvvm.data.model

import com.google.gson.annotations.SerializedName

data class RickAndMortyOrigin (
    @SerializedName("name")
    val namePlanet : String,
    val location:RickAndMortyLocation
)
