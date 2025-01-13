package com.example.daggerhilt.currency

interface CurrencyRepository {
    fun getCurrencies(): List<CurrencyModels>
}