package ru.kirshov.fastcurrencyinformer.presentation.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.kirshov.fastcurrencyinformer.R
import ru.kirshov.fastcurrencyinformer.domain.viewmodels.CryptocurrenyViewModel

@AndroidEntryPoint
class CryptocurrencyMainFragment:Fragment(R.layout.currency_main_fargment) {
    private val viewModel: CryptocurrenyViewModel by viewModels()
}