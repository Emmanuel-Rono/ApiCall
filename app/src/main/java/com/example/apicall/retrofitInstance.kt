package com.example.apicall

import com.example.apicall.Network.ApiService
import com.example.apicall.ui.constants
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

class RetrofitInstance
{
    companion object
    {
        //.build() creates retrofit object
        //Retrofit needs the base URI for the web service,
//The converter tells Retrofit what to do with the data it gets back from the web service
        private val retrofit = Retrofit.Builder().addConverterFactory(ScalarsConverterFactory.create())
            .baseUrl(constants.BASE_URL)
            .build()
    }
    val api by lazy {
       retrofit.create(ApiService::class.java)

}

}