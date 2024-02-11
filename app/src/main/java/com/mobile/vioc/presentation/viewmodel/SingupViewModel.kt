package com.mobile.vioc.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class SingupViewModel : ViewModel() {

    fun doSigUp() {
        viewModelScope.launch {

        }
    }
}