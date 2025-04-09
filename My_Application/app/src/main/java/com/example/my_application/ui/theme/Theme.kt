package com.eosrmg.apps.fetchdataretrofit.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// 1. Define your color scheme
private val LightColors = lightColorScheme(
    primary = Color(0xFF0D47A1),
    onPrimary = Color.White,
    secondary = Color(0xFFFFA000),
    onSecondary = Color.Black,
    background = Color(0xFFF5F5F5),
    onBackground = Color.Black,
    surface = Color.White,
    onSurface = Color.Black
)

// 2. Define your typography (optional – can use default if you prefer)
private val AppTypography = Typography(
    bodyLarge = Typography().bodyLarge.copy(
        color = Color.Black
    ),
    titleLarge = Typography().titleLarge.copy(
        color = Color(0xFF0D47A1)
    )
)

// 3. Define shapes (optional)
private val AppShapes = Shapes(
    small = RoundedCornerShape(4),
    medium = RoundedCornerShape(8),
    large = RoundedCornerShape(16)
)

// 4. Compose Theme function
@Composable
fun FetchDataRetrofitTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = AppTypography,
        shapes = AppShapes,
        content = content
    )
}
