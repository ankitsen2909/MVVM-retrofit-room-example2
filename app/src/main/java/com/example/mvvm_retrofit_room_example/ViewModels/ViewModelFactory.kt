package com.example.complete_mvvm_with_retrofit.ViewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_retrofit_room_example.Repository.QuoteRepository

class MainViewModelFactory( val repos : QuoteRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return com.example.mvvm_retrofit_room_example.ViewModel(repos) as T
    }
}