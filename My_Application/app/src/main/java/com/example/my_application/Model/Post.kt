package com.example.my_application.Model

data class Product(
    val id: Int,
    val title: String,
    val description: String,
    val images: List<String>,
    val rating: Double,
    val category: String,
    val price: Double
)


data class ProductResponse(
    val products: List<Product>
)
