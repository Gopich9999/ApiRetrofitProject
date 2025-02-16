package com.example.apiretrofitproject.model

import retrofit2.Response

data class TodoResponse(
    val todos: Response<TodoResponse>
)