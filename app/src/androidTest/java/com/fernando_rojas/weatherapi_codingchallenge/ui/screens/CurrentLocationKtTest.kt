package com.fernando_rojas.weatherapi_codingchallenge.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onNodeWithText
import com.fernando_rojas.weatherapi_codingchallenge.data.model.geocoding.GeocodingModel
import org.junit.Rule
import org.junit.Test


class CurrentLocationKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun searchBar_isDisplayed() {
        composeTestRule.setContent {
            com.fernando_rojas.weatherapi_codingchallenge.ui.screens.SearchBar(
                query = "",
                onSearch = {},
                onLocationClick = {}
            )
        }

        composeTestRule.onNodeWithText("Location Search...").assertIsDisplayed()
    }

    @Test
    fun searchBar_withText_displaySearchLocationItem() {
        val location = GeocodingModel(
            name = "London",
            state = "England",
            cntry = "United Kingdom",
            latitude = 45.5678,
            longitude = -0.3452
        )
        val searchText = "London"

        composeTestRule.setContent {
            Column {
                com.fernando_rojas.weatherapi_codingchallenge.ui.screens.SearchBar(
                    query = searchText,
                    onSearch = {},
                    onLocationClick = {}
                )
                com.fernando_rojas.weatherapi_codingchallenge.ui.screens.SearchedLocationItem(
                    location = location,
                    onLocationClick = { _, _ -> }
                )
            }
        }

        composeTestRule.onAllNodesWithText(location.name.toString()).assertCountEquals(2)
        composeTestRule.onAllNodesWithText(location.state.toString()).assertCountEquals(1)
        composeTestRule.onAllNodesWithText(location.cntry.toString()).assertCountEquals(1)

    }

}