package com.example.retrofit_exemple1

import retrofit2.http.GET

interface UserService {

    @GET("users")
    suspend fun getUsers():List<User>
}