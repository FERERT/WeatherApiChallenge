package com.fernando_rojas.weatherapi_codingchallenge.data.repository

import com.fernando_rojas.weatherapi_codingchallenge.data.model.forecast.ForecastModel
import com.fernando_rojas.weatherapi_codingchallenge.data.model.geocoding.GeocodingModel
import com.fernando_rojas.weatherapi_codingchallenge.data.model.weather.WeatherModel

interface Repository{
    suspend fun getWeather(latitude: Double?, longitude: Double?, units: String, apiKey: String): WeatherModel
    suspend fun getCoordinates(query: String, limit: Int, apiKey: String): List<GeocodingModel>
    suspend fun getForecast(latitude: Double?, longitude: Double?, units: String, apiKey: String): ForecastModel
}