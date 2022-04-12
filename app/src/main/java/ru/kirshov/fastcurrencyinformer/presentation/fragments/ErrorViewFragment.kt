package ru.kirshov.fastcurrencyinformer.presentation.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import ru.kirshov.fastcurrencyinformer.domain.viewmodels.ErrorViewModel

class ErrorViewFragment:Fragment() {
    private val viewModel: ErrorViewModel by viewModels()
}