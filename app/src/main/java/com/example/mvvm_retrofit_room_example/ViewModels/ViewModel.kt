package com.example.mvvm_retrofit_room_example

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm_retrofit_room_example.Repository.QuoteRepository
import com.example.mvvm_retrofit_room_example.models.quotes
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel(val repos : QuoteRepository) : ViewModel() {

    init{
        viewModelScope.launch(Dispatchers.IO) {
            repos.data(1)
        }
    }
//
//    val quotess :  MutableLiveData<quotes>
//        get()= repos.quotesMutableLiveData


    val quotess : MutableList<quotes>
    get()=repos.quotesMutableList


}