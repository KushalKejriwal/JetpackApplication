package com.example.my_application.api

import com.example.my_application.Model.ProductResponse
import retrofit2.http.GET

interface Services {
    @GET("products")
    suspend fun getProducts(): ProductResponse
}
