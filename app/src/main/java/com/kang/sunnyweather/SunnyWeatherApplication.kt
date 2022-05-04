package com.kang.sunnyweather

import android.app.Application
import android.content.Context

/**
 * Date: 2022/4/14
 * Author: SunBinKang
 * Description:
 */
class SunnyWeatherApplication : Application() {

    companion object {
        lateinit var context: Context
        const val TOKEN = "填入申请的令牌值"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}