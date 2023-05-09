package com.example.mvvm_retrofit_room_example.Repository

import androidx.lifecycle.MutableLiveData
import com.example.mvvm_retrofit_room_example.API.Api_Services
import com.example.mvvm_retrofit_room_example.models.quotes

class QuoteRepository(val quotes_service : Api_Services) {


//    val quotesMutableLiveData= MutableLiveData<quotes>()
//    suspend fun data( page:Int) {
//        val results = quotes_service.get_quotes(page)
//        if (results.body() != null) {
//            quotesMutableLiveData.postValue(results.body())
//        }
//    }

    lateinit var quotesMutableList: MutableList<quotes>

    suspend fun data( page:Int)  {
        val results = quotes_service.get_quotes(page)
        if (results.body()!= null) {
            quotesMutableList.add(results.body()!!)
        }
    }

}