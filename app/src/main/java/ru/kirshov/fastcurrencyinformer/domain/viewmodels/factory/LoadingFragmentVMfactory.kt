package ru.kirshov.fastcurrencyinformer.domain.viewmodels.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import ru.kirshov.fastcurrencyinformer.domain.navigator.ApplicationNavigator
import ru.kirshov.fastcurrencyinformer.domain.viewmodels.LoadingFragmentViewModel

const val Error = "Unknown ViewModel class"
class LoadingFragmentVMfactory(private val navigator:NavController):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoadingFragmentViewModel::class.java)){
            return LoadingFragmentViewModel(navigator = ApplicationNavigator(navigator)) as T
        }
        throw IllegalArgumentException(Error)
    }
}