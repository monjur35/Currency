package com.example.currency

import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers


interface ApiService {


    @Headers("apiKey: uPRs1KISTPQVG7cSSBu6qZ4xkTpcgJ5V")
    @GET("list")
    fun callApi ():Call<Response>

}