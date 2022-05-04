package com.kang.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Date: 2022/4/24
 * Author: SunBinKang
 * Description:未来几天天气信息接口返回的json数据model
 */

data class DailyResponse(val status: String, val result: Result) {

    //这里的Result类和RealtimeResponse的Result类不会冲突
    data class Result(val daily: Daily)

    data class Daily(val temperature: List<Temperature>, val skycon: List<Skycon>, @SerializedName("life_index") val lifeIndex: LifeIndex)

    data class Temperature(val max: Float, val min: Float)

    data class Skycon(val value: String, val date: Date)

    data class LifeIndex(val coldRisk: List<LifeDescription>, val carWashing: List<LifeDescription>, val ultraviolet: List<LifeDescription>, val dressing: List<LifeDescription>)

    data class LifeDescription(val desc: String)

}