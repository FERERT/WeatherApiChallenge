package com.fernando_rojas.weatherapi_codingchallenge.data.model.forecast


import com.google.gson.annotations.SerializedName

data class SysModel(
    @SerializedName("pod")
    val pod: String? = ""
)