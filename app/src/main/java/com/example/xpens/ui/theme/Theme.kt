package com.example.xpens.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// ============================================================
// DARK MODE SUPPORTING COLORS
// ============================================================
private val ColorDarkBackground = Color(0xFF1C1916)
private val ColorDarkSurface = Color(0xFF25211E)
private val ColorDarkSurfaceVariant = Color(0xFF3A342F)
private val ColorDarkText = Color(0xFFF5F0EA)
private val ColorDarkSecondaryText = Color(0xFFC7BFB7)
private val ColorDarkOutline = Color(0xFF6B625A)
private val ColorDarkMoneyInSurface = Color(0xFF173B2A)
private val ColorDarkErrorSurface = Color(0xFF4A211B)

// ============================================================
// LIGHT COLOR SCHEME
// ============================================================
private val XpensLightColorScheme = lightColorScheme(
    // BRAND
    primary = XpensPrimary,
    onPrimary = XpensOnPrimary,
    primaryContainer = XpensPrimary,
    onPrimaryContainer = XpensOnPrimary,

    // SECONDARY
    secondary = XpensSecondaryText,
    onSecondary = XpensOnPrimary,
    secondaryContainer = XpensSurfaceSubtle,
    onSecondaryContainer = XpensText,

    // TERTIARY / MONEY IN
    tertiary = XpensMoneyIn,
    onTertiary = XpensOnMoneyIn,
    tertiaryContainer = XpensMoneyInSurface,
    onTertiaryContainer = XpensMoneyIn,

    // BACKGROUND
    background = XpensBackground,
    onBackground = XpensText,

    // SURFACES
    surface = XpensSurface,
    onSurface = XpensText,
    surfaceVariant = XpensSurfaceSubtle,
    onSurfaceVariant = XpensSecondaryText,

    // BORDERS
    outline = XpensBorder,
    outlineVariant = XpensBorder,

    // ERROR
    error = XpensMoneyOut,
    onError = XpensOnMoneyOut,
    errorContainer = XpensErrorSurface,
    onErrorContainer = XpensText
)

// ============================================================
// DARK COLOR SCHEME
// ============================================================
private val XpensDarkColorScheme = darkColorScheme(
    // BRAND
    primary = XpensPrimary,
    onPrimary = XpensOnPrimary,
    primaryContainer = XpensPrimaryDark,
    onPrimaryContainer = XpensOnPrimary,

    // SECONDARY
    secondary = ColorDarkSecondaryText,
    onSecondary = ColorDarkBackground,
    secondaryContainer = ColorDarkSurfaceVariant,
    onSecondaryContainer = ColorDarkText,

    // TERTIARY / MONEY IN
    tertiary = XpensMoneyIn,
    onTertiary = XpensOnMoneyIn,
    tertiaryContainer = ColorDarkMoneyInSurface,
    onTertiaryContainer = ColorDarkText,

    // BACKGROUND
    background = ColorDarkBackground,
    onBackground = ColorDarkText,

    // SURFACE
    surface = ColorDarkSurface,
    onSurface = ColorDarkText,
    surfaceVariant = ColorDarkSurfaceVariant,
    onSurfaceVariant = ColorDarkSecondaryText,

    // BORDERS
    outline = ColorDarkOutline,
    outlineVariant = ColorDarkOutline,

    // ERROR
    error = XpensMoneyOutDark,
    onError = XpensOnMoneyOut,
    errorContainer = ColorDarkErrorSurface,
    onErrorContainer = ColorDarkText
)

// ============================================================
// XPENS THEME
// ============================================================
@Composable
fun XpensTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme =
        if (darkTheme) {
            XpensDarkColorScheme
        } else {
            XpensLightColorScheme
        }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = MaterialTheme.typography,
        content = content
    )
}
