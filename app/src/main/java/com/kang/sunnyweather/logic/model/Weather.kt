package com.kang.sunnyweather.logic.model

/**
 * Date: 2022/4/26
 * Author: SunBinKang
 * Description: 将RealtimeResponse和DailyResponse两个类封装到Weather中
 */
data class Weather(val realtime:RealtimeResponse.Realtime,val daily: DailyResponse.Daily)