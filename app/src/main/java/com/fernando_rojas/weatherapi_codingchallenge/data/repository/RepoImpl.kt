package com.fernando_rojas.weatherapi_codingchallenge.data.repository

import com.fernando_rojas.weatherapi_codingchallenge.data.model.forecast.ForecastModel
import com.fernando_rojas.weatherapi_codingchallenge.data.model.geocoding.GeocodingModel
import com.fernando_rojas.weatherapi_codingchallenge.data.model.weather.WeatherModel
import com.fernando_rojas.weatherapi_codingchallenge.data.remote.ApiRequest
import javax.inject.Inject

class RepoImpl @Inject constructor(
    private val apiReq: ApiRequest
): Repository {

    override suspend fun getWeather(
        latitude: Double?,
        longitude: Double?,
        units: String,
        apiKey: String
    ): WeatherModel = apiReq.getWeather(latitude, longitude, units, apiKey)

    override suspend fun getCoordinates(
        query: String,
        limit: Int,
        apiKey: String
    ): List<GeocodingModel> = apiReq.getCoordinates(query, limit, apiKey)

    override suspend fun getForecast(
        latitude: Double?,
        longitude: Double?,
        units: String,
        apiKey: String
    ): ForecastModel = apiReq.getForecast(latitude, longitude, units, apiKey)

}