package com.example.my_application.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.my_application.Model.Product
import com.example.my_application.api.RetrofitInstance
import kotlinx.coroutines.launch

class PostViewModel : ViewModel() {
    private val _products = mutableStateOf<List<Product>>(emptyList())
    val products: State<List<Product>> = _products

    init {
        fetchProducts()
    }

    private fun fetchProducts() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getProducts()
                _products.value = response.products
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
