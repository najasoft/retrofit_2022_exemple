package com.example.retrofit_exemple1

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class UserViewModel: ViewModel() {
  /*  init {
        getPosts()
    }

   */

    fun getUsers(): Flow<List<User>> = flow {
        emit(retrofitApi.UserService.getUsers())
    }.flowOn(Dispatchers.IO)
}