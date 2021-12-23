package com.example.retrofit_users.model.request.model

data class LoginResponse(
    val user_id: Int,
    val username: String,
    val email: String
)