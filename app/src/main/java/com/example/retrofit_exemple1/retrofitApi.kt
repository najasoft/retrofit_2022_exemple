package com.example.retrofit_exemple1

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object retrofitApi{
    private val baseUrl= "https://jsonplaceholder.typicode.com/"
    private val retrofit= Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()



val PostService= retrofit.create(PostService::class.java)
val UserService= retrofit.create(UserService::class.java)
}

