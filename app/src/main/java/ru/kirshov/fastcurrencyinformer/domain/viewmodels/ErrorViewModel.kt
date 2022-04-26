package ru.kirshov.fastcurrencyinformer.domain.viewmodels

import androidx.lifecycle.ViewModel
import ru.kirshov.fastcurrencyinformer.data.applicatindata.ErrorStore
import ru.kirshov.fastcurrencyinformer.domain.navigator.ErrorNav

class ErrorViewModel(
    private val navigation:ErrorNav,
    private val error:ErrorStore
):ViewModel() {
}