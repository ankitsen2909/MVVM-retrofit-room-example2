package com.example.mvvm_retrofit_room_example.API

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Database_object {

    val baseurl = "https://api.quotable.io"

    fun connect_to_API(): Retrofit{
        val retro_obj=Retrofit.Builder()
            .baseUrl(baseurl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retro_obj
    }


}