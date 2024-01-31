package com.fernando_rojas.weatherapi_codingchallenge.data.model.weather


import com.google.gson.annotations.SerializedName

data class CoordModel(

    @SerializedName("lon")
    val longitude: Double? = 0.0,
    @SerializedName("lat")
    val latitude: Double? = 0.0
)