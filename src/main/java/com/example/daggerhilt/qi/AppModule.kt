package com.example.daggerhilt.qi

import com.example.daggerhilt.currency.CurrencyRepository
import com.example.daggerhilt.currency.CurrencyRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideCurrencyRepository(): CurrencyRepository {
        return CurrencyRepositoryImpl()
    }
}