package com.fernando_rojas.weatherapi_codingchallenge.data.model.weather


import com.google.gson.annotations.SerializedName

data class WindyModel(
    @SerializedName("deg")
    val deg: Int? = 0,
    @SerializedName("speed")
    val velocity: Double? = 0.0
)