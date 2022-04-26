package ru.kirshov.fastcurrencyinformer.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.kirshov.fastcurrencyinformer.R
import ru.kirshov.fastcurrencyinformer.databinding.LoadingFargmentBinding
import ru.kirshov.fastcurrencyinformer.domain.ViewBindingDelegated
import ru.kirshov.fastcurrencyinformer.domain.viewmodels.LoadingFragmentViewModel
import ru.kirshov.fastcurrencyinformer.domain.viewmodels.factory.ApplicationVMFactory

@AndroidEntryPoint
class LoadingSplashFragment : Fragment(R.layout.loading_fargment) {
   private val viewBinding by ViewBindingDelegated(LoadingFargmentBinding::bind)
   private val viewModel:LoadingFragmentViewModel by viewModels{
      val context = requireContext().applicationContext
      val navigator = viewBinding.root.findNavController()
      ApplicationVMFactory(nav = navigator, appContext = context)
   }
   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)
      viewBinding.progressBar.setOnClickListener {
         viewModel.click()
      }
   }
}