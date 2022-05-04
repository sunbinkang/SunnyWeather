package com.kang.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * Date: 2022/4/24
 * Author: SunBinKang
 * Description:实时天气信息接口返回的json数据model
 */
/*
*
* {
	"status": "ok",
	"result": {
		"realtime": {
			"temperature": 23.16,
			"skycon": "WIND",
			"air quality": {
				"aqi": {
					"chn": 17.0
				}
			}
		}
	}
* */
//注意，这里将所有的数据模型类都定义在了RealtimeResponse的内部，这样可以防止出现和其他接口的
// 数据模型类同名冲突的情况
data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)

    data class Realtime(
        val skycon: String, val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)

}