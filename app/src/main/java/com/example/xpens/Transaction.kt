package com.example.xpens

import java.util.Date
enum class TransactionType {
    CREDIT,
    DEBIT
}

enum class TransactionCategory {
    FOOD,
    TRAVEL,
    SHOPPING,
    BILLS,
    ENTERTAINMENT,
    HEALTH,
    OTHER
}

data class Transaction(
    val amount: Double,
    val itemName: String,
    val note: String,
    val category: TransactionCategory,
    val type: TransactionType,
    val datetime: Date= Date(),
)