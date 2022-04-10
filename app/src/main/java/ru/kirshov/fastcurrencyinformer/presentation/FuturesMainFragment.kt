package ru.kirshov.fastcurrencyinformer.presentation

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import ru.kirshov.fastcurrencyinformer.R
import ru.kirshov.fastcurrencyinformer.domain.FutureViewModel

class FuturesMainFragment:Fragment(R.layout.futures_main_fargment) {
    private val viewModel:FutureViewModel by viewModels()
}