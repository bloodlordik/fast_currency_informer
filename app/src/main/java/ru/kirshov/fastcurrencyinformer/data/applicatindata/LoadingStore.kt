package ru.kirshov.fastcurrencyinformer.data.applicatindata

import kotlinx.coroutines.flow.Flow

interface LoadingStore {
    fun getLoadingData():Flow<LoadingData>
}