package com.example.apicall.Network


import com.example.apicall.ui.constants
import com.example.apicall.ui.viewModel
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

interface ApiService {
     //interface
    //define how tretrofit talks to the  server
        //Telling that this  is a Get request
        //Endpoint is photos-photos will be appended to the base url
        @GET("photos")
        suspend fun getPhotos():String

    }






