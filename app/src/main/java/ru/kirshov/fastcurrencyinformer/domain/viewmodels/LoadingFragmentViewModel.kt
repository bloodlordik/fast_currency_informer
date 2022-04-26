package ru.kirshov.fastcurrencyinformer.domain.viewmodels

import androidx.lifecycle.ViewModel
import ru.kirshov.fastcurrencyinformer.data.applicatindata.LoadingStore
import ru.kirshov.fastcurrencyinformer.domain.navigator.EntryNavigation

class LoadingFragmentViewModel(
    private val navigator: EntryNavigation,
    private val store: LoadingStore
) : ViewModel() {
    fun click() {
        navigator.loadSuccessful()
    }
}