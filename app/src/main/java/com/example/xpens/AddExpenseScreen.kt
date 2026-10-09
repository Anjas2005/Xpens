package com.example.xpens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.xpens.ui.theme.Cinzel
import com.example.xpens.ui.theme.FreeSerif
import com.example.xpens.ui.theme.XpensBackground
import com.example.xpens.ui.theme.XpensPrimary
import com.example.xpens.ui.theme.XpensText


@Composable
fun AddExpenseScreen(
    viewModel: ExpenseViewModel,
    navController: NavController
) {
    // Full Page is represented by column
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(XpensBackground)
            .padding(20.dp)
    ) {
        // This entire row will represent the NavBar of this Page
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Back Button
            IconButton(
                onClick = {
                    navController.popBackStack()
                },
                modifier = Modifier.offset(x = (-16).dp)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Go Back",
                )
            }

            // First Logo
            Image(
                painter = painterResource(id = R.drawable.new_transaction_logo),
                contentDescription = "New Transaction Logo",
                modifier = Modifier.size(32.dp),
                contentScale = ContentScale.Fit
            )

            // New Transaction Text
            Text(
                text = "New Transaction",
                modifier = Modifier.padding(start = 8.dp, top = 5.dp),
                fontFamily = FreeSerif,
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
            )

            // Profile Icon
            // TODO: This will further need to show profile when needed
            Spacer(modifier = Modifier.weight(1f))
            IconButton(
                onClick = {
                    // TODO: Add Profile Section Later
                },
                modifier = Modifier
                    .padding(top = 5.dp)
                    .size(48.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.screen),
                    modifier = Modifier.size(32.dp),
                    contentDescription = "Profile",
                    contentScale = ContentScale.Fit
                )
            }
        }
    }
}

