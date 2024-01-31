package com.fernando_rojas.weatherapi_codingchallenge.data.model.geocoding


import com.google.gson.annotations.SerializedName

data class GeocodingModel(

    @SerializedName("lon")
    val longitude: Double? = 0.0,
    @SerializedName("lat")
    val latitude: Double? = 0.0,
    @SerializedName("country")
    val cntry: String? = "",
    @SerializedName("local_names")
    val localNames: LocalNamesModel? = LocalNamesModel(),
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("state")
    val state: String? = ""
)