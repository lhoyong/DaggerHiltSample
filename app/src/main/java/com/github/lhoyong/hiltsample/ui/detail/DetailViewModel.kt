package com.github.lhoyong.hiltsample.ui.detail

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailViewModel @ViewModelInject constructor() : ViewModel() {

    private val _text = MutableLiveData<String>()
    val text: LiveData<String>
        get() = _text

    fun bindText(text: String) {
        _text.value = "$text to Detail"
    }
}