package com.fernando_rojas.weatherapi_codingchallenge.data.model.forecast


import com.google.gson.annotations.SerializedName

data class ForecastListModel(

    @SerializedName("pop")
    val pop: Double? = 0.0,
    @SerializedName("dt")
    val dt: Int? = 0,
    @SerializedName("dt_txt")
    val dtText: String? = "",
    @SerializedName("clouds")
    val clouds: CloudingModel? = CloudingModel(),
    @SerializedName("main")
    val main: MainModel? = MainModel(),
    @SerializedName("visibility")
    val visibility: Int? = 0,
    @SerializedName("rain")
    val precipitations: PrecipitationsModel? = PrecipitationsModel(),
    @SerializedName("sys")
    val sys: SysModel? = SysModel(),
    @SerializedName("wind")
    val wind: WindyModel? = WindyModel(),
    @SerializedName("weather")
    val weather: List<WeatherModel?>? = listOf()

)