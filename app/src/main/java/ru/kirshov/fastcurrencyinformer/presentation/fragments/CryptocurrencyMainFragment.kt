package ru.kirshov.fastcurrencyinformer.presentation.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import ru.kirshov.fastcurrencyinformer.R
import ru.kirshov.fastcurrencyinformer.domain.viewmodels.CryptocurrenyViewModel

class CryptocurrencyMainFragment:Fragment(R.layout.currency_main_fargment) {
    private val viewModel: CryptocurrenyViewModel by viewModels()
}