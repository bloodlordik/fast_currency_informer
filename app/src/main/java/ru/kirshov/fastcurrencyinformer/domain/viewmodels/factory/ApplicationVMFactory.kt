package ru.kirshov.fastcurrencyinformer.domain.viewmodels.factory

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import ru.kirshov.fastcurrencyinformer.data.applicatindata.ApplicationStore
import ru.kirshov.fastcurrencyinformer.domain.navigator.ApplicationNavigator
import ru.kirshov.fastcurrencyinformer.domain.viewmodels.ErrorViewModel
import ru.kirshov.fastcurrencyinformer.domain.viewmodels.LoadingFragmentViewModel
import ru.kirshov.fastcurrencyinformer.getApp
import ru.kirshov.fastcurrencyinformer.presentation.fragments.ErrorViewFragment


class ApplicationVMFactory(
    nav: NavController,
    appContext: Context
) : ViewModelProvider.Factory {
    private val navigator = ApplicationNavigator(nav)
    private val dataStore = appContext.getApp().getStore()
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(LoadingFragmentViewModel::class.java) -> {
                LoadingFragmentViewModel(navigator, dataStore) as T
            }
            modelClass.isAssignableFrom(ErrorViewFragment::class.java) -> {
                ErrorViewModel(navigator, dataStore) as T
            }
            else -> {
                throw IllegalArgumentException()
            }
        }
    }

}
