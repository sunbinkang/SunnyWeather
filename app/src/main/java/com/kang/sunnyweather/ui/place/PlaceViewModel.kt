package com.kang.sunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.kang.sunnyweather.logic.Repository
import com.kang.sunnyweather.logic.model.Place

/**
 * Date: 2022/4/17
 * Author: SunBinKang
 * Description:
 */
class PlaceViewModel : ViewModel() {

    private val searchLiveDate = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLiveDate) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveDate.value = query
    }

    fun savePlace(place: Place) = Repository.savePlace(place)

    fun getSavedPlace() = Repository.getSavedPlace()

    fun isPlaceSaved() = Repository.isPlaceSaved()

}