package com.example.xpens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ExpenseViewModel : ViewModel() {

    var balance by mutableDoubleStateOf(0.0)
        private set
    val transactions = mutableStateListOf<Transaction>();

    // TODO: Make the transactions deletable by giving each of them an ID

    fun addTransaction(
        amount: Double,
        itemName: String,
        note: String,
        category: TransactionCategory,
        type: TransactionType,
    ) {

        val transaction = Transaction(
            amount = amount,
            itemName = itemName,
            note = note,
            category = category,
            type = type
        )

        transactions.add(transaction)

        when (type) {
            TransactionType.CREDIT -> balance += amount
            TransactionType.DEBIT -> balance -= amount
        }
    }

    fun getTotalCredit(): Double {
        return transactions
            .filter { it.type == TransactionType.CREDIT }
            .sumOf { it.amount }
    }

    fun getTotalDebit(): Double {
        return transactions
            .filter { it.type == TransactionType.DEBIT }
            .sumOf { it.amount }
    }
}