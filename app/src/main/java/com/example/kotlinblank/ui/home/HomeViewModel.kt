package com.example.kotlinblank.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.Locale
fun String.removeFirstLastChar():
        String = this.substring(1, this.length -1)

class HomeViewModel : ViewModel() {
    val string1 = "Today is cloudy"
    val string2 = string1.removeFirstLastChar()
    var cont = "ALEC"
//    println("Hi ${cont.toLowerCase()}")
    private val _text = MutableLiveData<String>().apply {
        value = "Hi ${cont.lowercase(Locale.ROOT)}  $string2"
    }
    val text: LiveData<String> = _text
}