package com.example.retrofit_exemple1

import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface PostService {
    @GET("posts")
  suspend  fun getPosts(): List<Post>
}