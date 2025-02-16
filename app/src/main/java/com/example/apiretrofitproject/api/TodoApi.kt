package com.example.apiretrofitproject.api

import com.example.apiretrofitproject.model.Todo
import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {

    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>

}