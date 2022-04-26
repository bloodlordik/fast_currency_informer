package ru.kirshov.fastcurrencyinformer.di

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp
import retrofit2.Retrofit
import ru.kirshov.fastcurrencyinformer.data.ApplicationState
import ru.kirshov.fastcurrencyinformer.data.applicatindata.ApplicationStore

@HiltAndroidApp
class FastCurrencyApplication:Application()