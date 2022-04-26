package ru.kirshov.fastcurrencyinformer.domain.navigator

import androidx.navigation.NavController
import ru.kirshov.fastcurrencyinformer.R

class ApplicationNavigator(private val navigator:NavController):EntryNavigation,ErrorNav {
    override fun loadSuccessful() {
        navigator.navigate(R.id.action_loadingSplashFragment_to_rootFragment)
    }

    override fun loadError() {
        navigator.navigate(R.id.action_loadingSplashFragment_to_errorViewFragment)
    }

    override fun backToLoadingFragment() {
        navigator.navigate(R.id.action_errorViewFragment_to_loadingSplashFragment)
    }
}