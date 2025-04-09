package com.example.my_application

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.eosrmg.apps.fetchdataretrofit.ui.theme.FetchDataRetrofitTheme
import com.example.my_application.ui.view.PostListScreen
import com.example.my_application.viewModel.PostViewModel
import androidx.navigation.compose.rememberNavController
import com.example.my_application.ui.navigation.AppNavGraph


class MainActivity : AppCompatActivity() {
    private val viewModel by viewModels<PostViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            FetchDataRetrofitTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color.LightGray
                ) {
                    AppNavGraph(navController = navController, viewModel = viewModel)
                }
            }
        }

    }
}
