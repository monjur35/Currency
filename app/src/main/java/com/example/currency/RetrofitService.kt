package com.example.currency

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {

    companion object{
        val baseUrl="https://api.apilayer.com/currency_data/"

        fun retrofitInstance():Retrofit{
            return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        fun abc(): ApiService {
            return retrofitInstance().create(ApiService::class.java)
        }
    }
}