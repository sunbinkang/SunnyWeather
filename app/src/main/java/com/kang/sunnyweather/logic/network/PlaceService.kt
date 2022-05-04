package com.kang.sunnyweather.logic.network

import com.kang.sunnyweather.SunnyWeatherApplication
import com.kang.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Date: 2022/4/14
 * Author: SunBinKang
 * Description:
 */
interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}