package com.fernando_rojas.weatherapi_codingchallenge.data.model.forecast


import com.google.gson.annotations.SerializedName

data class PrecipitationsModel(
    @SerializedName("3h")
    val h: Double? = 0.0
)