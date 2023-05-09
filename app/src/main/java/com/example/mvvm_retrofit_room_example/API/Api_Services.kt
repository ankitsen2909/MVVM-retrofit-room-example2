package com.example.mvvm_retrofit_room_example.API

import com.example.mvvm_retrofit_room_example.models.quotes
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface Api_Services {

    @GET("/quotes")
    suspend fun get_quotes(@Query("page")page:Int) : Response<quotes>

}