package com.fernando_rojas.weatherapi_codingchallenge.data.repository

import com.fernando_rojas.weatherapi_codingchallenge.data.model.forecast.ForecastModel
import com.fernando_rojas.weatherapi_codingchallenge.data.model.geocoding.GeocodingModel
import com.fernando_rojas.weatherapi_codingchallenge.data.model.weather.WeatherModel
import com.fernando_rojas.weatherapi_codingchallenge.data.remote.ApiRequest
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

class RepoImplTest {

    @Mock
    private lateinit var mockApiRequest: ApiRequest

    private lateinit var repoImpl: RepoImpl

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        repoImpl = RepoImpl(mockApiRequest)
    }

    @Test
    fun `getWeather should return WeatherModel from ApiRequest`() = runBlocking {
        val latitude = 37.7749
        val longitude = -122.4194
        val apiKey = "API_KEY"
        val units = "metric"

        val expectedWeatherModel = WeatherModel(base = "base", cod = 1, id = 1, name = "Mock")
        `when`(mockApiRequest.getWeather(latitude, longitude, units, apiKey))
            .thenReturn(expectedWeatherModel)

        val result = repoImpl.getWeather(latitude, longitude, units, apiKey)

        assertThat(result).isEqualTo(expectedWeatherModel)
    }

    @Test
    fun `getCoordinates should return list of GeocodingItemModel from ApiRequest`() = runBlocking {
        val query = "San Francisco"
        val limit = 5
        val apiKey = "API_KEY"
        val expectedGeocodingModels = listOf(
            GeocodingModel(name = "San Francisco", state = "California"),
            GeocodingModel(name = "San Francisco", state = "California"),
            GeocodingModel(name = "San Francisco", state = "California")
        )
        `when`(mockApiRequest.getCoordinates(query, limit, apiKey))
            .thenReturn(expectedGeocodingModels)

        val result = repoImpl.getCoordinates(query, limit, apiKey)

        assertThat(result).isEqualTo(expectedGeocodingModels)
    }

    @Test
    fun `getForecast should return ForecastModel from ApiRequest`()= runBlocking {
        val latitude = 37.7749
        val longitude = -122.4194
        val apiKey = "API_KEY"
        val units = "metric"

        val expectedForecastModel = ForecastModel(code = "1", message = 0, cnt = 1)
        `when`(mockApiRequest.getForecast(latitude, longitude, units, apiKey))
            .thenReturn(expectedForecastModel)

        val result = repoImpl.getForecast(latitude, longitude, units, apiKey)

        assertThat(result).isEqualTo(expectedForecastModel)
    }
}