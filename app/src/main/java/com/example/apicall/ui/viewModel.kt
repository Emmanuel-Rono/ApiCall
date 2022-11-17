package com.example.apicall.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class viewModel(): ViewModel()
{
    private val thePhoto=MutableLiveData<String>()
    val status:LiveData<String> = thePhoto

    private fun getPhoto() =viewModelScope.launch{


    }
}
