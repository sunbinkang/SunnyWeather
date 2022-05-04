package com.kang.sunnyweather.logic.dao

import android.content.Context
import com.google.gson.Gson
import com.kang.sunnyweather.SunnyWeatherApplication
import com.kang.sunnyweather.logic.model.Place

/**
 * Date: 2022/5/4
 * Author: SunBinKang
 * Description:
 */
object PlaceDao {

    fun savePlace(place: Place) {
        sharedPreferences().edit().putString("place", Gson().toJson(place))
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() =
        SunnyWeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)


}