package com.fernando_rojas.weatherapi_codingchallenge.data.model.weather


import com.google.gson.annotations.SerializedName

data class MainModel(

    @SerializedName("temp_max")
    val maxTemp: Double? = 0.0,
    @SerializedName("temp_min")
    val minTemp: Double? = 0.0,
    @SerializedName("feels_like")
    val seemsLike: Double? = 0.0,
    @SerializedName("humidity")
    val moisture: Int? = 0,
    @SerializedName("pressure")
    val pressure: Int? = 0,
    @SerializedName("temp")
    val temperature: Double? = 0.0
)