package com.example.daggerhilt.currency

import com.example.daggerhilt.R
import javax.inject.Inject

class CurrencyRepositoryImpl @Inject constructor() : CurrencyRepository {
    override fun getCurrencies(): List<CurrencyModels> {
        return listOf(
            CurrencyModels("Dollar", R.drawable.dollar),
            CurrencyModels("Euro", R.drawable.euro),
            CurrencyModels("Ruble", R.drawable.ruble)
        )
    }
}