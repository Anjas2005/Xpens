package com.example.xpens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.xpens.ui.theme.XpensTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            XpensTheme {
                // NOTE: Nav controller to handle navigation
                val navController = rememberNavController()
                val expenseViewModel: ExpenseViewModel = viewModel()
                NavHost(
                    navController = navController,
                    startDestination = "add"
                ) {
                    composable("add") {
                        AddExpenseScreen(
                            viewModel = expenseViewModel,
                            navController = navController
                        )
                    }
//                    composable("transactions") {
//                        TransactionsScreen(
//                            viewModel = expenseViewModel,
//                            navController = navController
//                        )
//                    }
//
//                    composable("balance") {
//                        BalanceScreen(
//                            viewModel = expenseViewModel,
//                            navController = navController
//                        )
//                    }
                }
            }
        }
    }
}