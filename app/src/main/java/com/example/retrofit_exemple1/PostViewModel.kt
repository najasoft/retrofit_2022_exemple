package com.example.retrofit_exemple1

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class PostViewModel: ViewModel() {
  /*  init {
        getPosts()
    }

   */

    fun getPosts(): Flow<List<Post>> = flow {
        emit(retrofitApi.PostService.getPosts())
    }.flowOn(Dispatchers.IO)
}