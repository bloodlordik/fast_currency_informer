package ru.kirshov.fastcurrencyinformer.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import ru.kirshov.fastcurrencyinformer.R
import ru.kirshov.fastcurrencyinformer.domain.LoadingFragmentViewModel


class LoadingSplashFragment:Fragment(R.layout.loading_fargment) {
    private val viewModel:LoadingFragmentViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        req
    }
}