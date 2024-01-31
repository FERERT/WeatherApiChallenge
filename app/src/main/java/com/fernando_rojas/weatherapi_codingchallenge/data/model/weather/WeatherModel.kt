package com.fernando_rojas.weatherapi_codingchallenge.data.model.weather


import com.google.gson.annotations.SerializedName

data class WeatherModel(
    @SerializedName("base")
    val base: String? = "",
    @SerializedName("clouds")
    val clouds: CloudingModel? = CloudingModel(),
    @SerializedName("cod")
    val cod: Int? = 0,
    @SerializedName("coord")
    val coord: CoordModel? = CoordModel(),
    @SerializedName("dt")
    val dt: Int? = 0,
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("main")
    val main: MainModel? = MainModel(),
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("sys")
    val sys: SysModel? = SysModel(),
    @SerializedName("timezone")
    val timezone: Int? = 0,
    @SerializedName("visibility")
    val visibility: Int? = 0,
    @SerializedName("weather")
    val weather: List<WeatherModel2>? = listOf(),
    @SerializedName("wind")
    val wind: WindyModel? = WindyModel()
)