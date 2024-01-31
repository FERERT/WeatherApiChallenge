package com.fernando_rojas.weatherapi_codingchallenge.data.model.forecast


import com.google.gson.annotations.SerializedName

data class CloudingModel(
    @SerializedName("all")
    val all: Int? = 0
)