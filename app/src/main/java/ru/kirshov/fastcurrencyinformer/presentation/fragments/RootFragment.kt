package ru.kirshov.fastcurrencyinformer.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.kirshov.fastcurrencyinformer.R
import ru.kirshov.fastcurrencyinformer.databinding.RootFragmentBinding
import ru.kirshov.fastcurrencyinformer.domain.ViewBindingDelegated
import ru.kirshov.fastcurrencyinformer.domain.viewmodels.RootViewModel
@AndroidEntryPoint
class RootFragment:Fragment(R.layout.root_fragment) {
    private val viewBinding:RootFragmentBinding by ViewBindingDelegated(RootFragmentBinding::bind)
    private val viewModel:RootViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = viewBinding.designNavigationView.findNavController()
        val bottomBar = viewBinding.bottomNavigationBar
        bottomBar.setupWithNavController(controller)

    }
}