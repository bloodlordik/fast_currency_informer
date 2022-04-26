package ru.kirshov.fastcurrencyinformer.domain

import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.annotation.MainThread
import androidx.fragment.app.Fragment
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.viewbinding.ViewBinding
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ViewBindingDelegated<T : ViewBinding>(
    private val binder:(View)->T
) : ReadOnlyProperty<Fragment, T> {
    internal var viewBinding:T? = null
    private val lifecycleObserver = BindingLifeObserver()

    @MainThread
    override fun getValue(thisRef: Fragment, property: KProperty<*>): T {
        this.viewBinding?.let { return it }
        val view = thisRef.requireView()
        thisRef.viewLifecycleOwner.lifecycle.addObserver(lifecycleObserver)
        return binder.invoke(view).also { viewBinding = it }

    }

    private inner class BindingLifeObserver:DefaultLifecycleObserver{
        private val mainHandler = Handler(Looper.getMainLooper())
        @MainThread
        override fun onDestroy(owner: LifecycleOwner) {
            owner.lifecycle.removeObserver(lifecycleObserver)
            mainHandler.post { viewBinding = null }
        }
    }
}

