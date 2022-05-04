package com.kang.sunnyweather.ui.weather

import androidx.lifecycle.*
import com.kang.sunnyweather.logic.Repository
import com.kang.sunnyweather.logic.model.Location
import com.kang.sunnyweather.logic.model.Weather

/**
 * Date: 2022/5/3
 * Author: SunBinKang
 * Description:
 */
class WeatherViewModel : ViewModel() {

    private val locationLiveData = MutableLiveData<Location>()

    /**
     * 这里放三个变量是保证它们在手机屏幕发生旋转的时候不会丢失
     */
    var locationLng = ""

    var locationLat = ""

    var placeName = ""

    val weatherLiveData: LiveData<Result<Weather>> =
        Transformations.switchMap(locationLiveData) { location ->
            Repository.refreshWeather(location.lng, location.lat)
        }

    fun refreshWeather(lng: String, lat: String) {
        locationLiveData.value = Location(lng, lat)
    }

}