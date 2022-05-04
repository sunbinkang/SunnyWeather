package com.kang.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * Date: 2022/4/14
 * Author: SunBinKang
 * Description:
 */
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)
