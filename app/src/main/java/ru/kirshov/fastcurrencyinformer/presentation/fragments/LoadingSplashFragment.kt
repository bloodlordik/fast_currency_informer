package ru.kirshov.fastcurrencyinformer.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.fragment.app.*
import androidx.navigation.findNavController
import ru.kirshov.fastcurrencyinformer.R
import ru.kirshov.fastcurrencyinformer.databinding.LoadingFargmentBinding
import ru.kirshov.fastcurrencyinformer.domain.viewmodels.LoadingFragmentViewModel
import ru.kirshov.fastcurrencyinformer.domain.viewmodels.factory.LoadingFragmentVMfactory


class LoadingSplashFragment:Fragment(R.layout.loading_fargment) {
    private val viewModel: LoadingFragmentViewModel by viewModels(){
        LoadingFragmentVMfactory(binding.root.findNavController())
    }
    private var _binding:LoadingFargmentBinding? = null
    private val binding:LoadingFargmentBinding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = LoadingFargmentBinding.bind(view)

        binding.progressBar.setOnClickListener {
            viewModel.click()
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}