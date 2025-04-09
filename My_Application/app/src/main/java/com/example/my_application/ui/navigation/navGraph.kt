package com.example.my_application.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.my_application.ui.view.PostListScreen
import com.example.my_application.ui.view.ProductDetailScreen
import com.example.my_application.viewModel.PostViewModel

@Composable
fun AppNavGraph(navController: NavHostController, viewModel: PostViewModel) {
    NavHost(navController = navController, startDestination = "postList") {
        composable("postList") {
            PostListScreen(viewModel = viewModel, onProductClick = { productId ->
                navController.navigate("productDetail/$productId")
            })
        }
        composable("productDetail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId")?.toIntOrNull()
            val product = viewModel.products.value.find { it.id == productId }
            product?.let {
                ProductDetailScreen(product = it)
            }
        }
    }
}
