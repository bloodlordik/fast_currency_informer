package ru.kirshov.fastcurrencyinformer.presentation.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import ru.kirshov.fastcurrencyinformer.R
import ru.kirshov.fastcurrencyinformer.domain.viewmodels.CurrencyViewModel

class CurrencyMainFragment:Fragment(R.layout.currency_main_fargment) {
    private val viewModel: CurrencyViewModel by viewModels()
}