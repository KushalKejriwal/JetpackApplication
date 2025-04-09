package com.example.my_application.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.my_application.Model.Product

@Composable
fun ProductDetailScreen(product: Product) {
    Column(modifier = Modifier.padding(16.dp)) {
        // Image carousel
        val pagerState = rememberPagerState(pageCount = { product.images.size })
        HorizontalPager(state = pagerState) { page ->
            val imagePainter = rememberAsyncImagePainter(model = product.images[page])
            Image(
                painter = imagePainter,
                contentDescription = "Product Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .clip(RoundedCornerShape(12.dp))
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = product.title, style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Rating: ${product.rating}")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Price: $${product.price}")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Category: ${product.category}")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Description:", style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = product.description)
    }
}
