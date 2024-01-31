package com.fernando_rojas.weatherapi_codingchallenge.data.model.weather


import com.google.gson.annotations.SerializedName

data class WeatherModel2(

    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("main")
    val main: String? = "",
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("icon")
    val icon: String? = ""
)