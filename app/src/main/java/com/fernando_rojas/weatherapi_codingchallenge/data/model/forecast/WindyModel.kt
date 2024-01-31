package com.fernando_rojas.weatherapi_codingchallenge.data.model.forecast


import com.google.gson.annotations.SerializedName

data class WindyModel(

    @SerializedName("speed")
    val velocity: Double? = 0.0,
    @SerializedName("gust")
    val blow: Double? = 0.0,
    @SerializedName("deg")
    val deg: Int? = 0

    )