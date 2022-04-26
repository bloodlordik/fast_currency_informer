package ru.kirshov.fastcurrencyinformer.presentation.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.kirshov.fastcurrencyinformer.R
import ru.kirshov.fastcurrencyinformer.domain.viewmodels.FutureViewModel
@AndroidEntryPoint
class FuturesMainFragment:Fragment(R.layout.futures_main_fargment) {
    private val viewModel: FutureViewModel by viewModels()
}