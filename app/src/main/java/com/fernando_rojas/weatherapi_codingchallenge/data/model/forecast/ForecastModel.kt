package com.fernando_rojas.weatherapi_codingchallenge.data.model.forecast


import com.google.gson.annotations.SerializedName

data class ForecastModel(

    @SerializedName("cod")
    val code: String? = "",
    @SerializedName("list")
    val list: List<ForecastListModel?> = listOf(),
    @SerializedName("cnt")
    val cnt: Int? = 0,
    @SerializedName("message")
    val message: Int? = 0
)