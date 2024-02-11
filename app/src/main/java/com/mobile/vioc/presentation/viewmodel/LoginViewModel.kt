package com.mobile.vioc.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class LoginViewModel :ViewModel(){

    fun doLogin(){
        viewModelScope.launch {

        }
    }
}