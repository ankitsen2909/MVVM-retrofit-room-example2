package com.example.mvvm_retrofit_room_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.complete_mvvm_with_retrofit.ViewModels.MainViewModelFactory
import com.example.mvvm_retrofit_room_example.API.Api_Services
import com.example.mvvm_retrofit_room_example.API.Database_object
import com.example.mvvm_retrofit_room_example.Repository.QuoteRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val dao= Database_object.connect_to_API().create(Api_Services::class.java)
        val repos=QuoteRepository(dao)
        val mvm= ViewModelProvider(this,MainViewModelFactory(repos))[ViewModel::class.java]


//        mvm.quotess.observe(this){
//            Log.d("test",it.count.toString())
//
//        }

        Log.d("test",mvm.quotess.toString())
////        mvm.quotess?.get(0)?.count
//        mvm.quotess?.forEach {
//            Log.d("test",it.toString())
//        }



    }
}