package com.quarkalchs.brainpeek

import androidx.lifecycle.ViewModel

class PeekerViewModel : ViewModel() {

    var longText = ""
    var longTextOnAList = mutableListOf<String>()
    var currentWord = ""

    fun listify() {
        val words = longText.split("\\s+").toTypedArray()
        for (i in words.indices) {
            // You may want to check for a non-word character before blindly
            // performing a replacement
            // It may also be necessary to adjust the character class
            words[i] = words[i].replace("[^\\w]".toRegex(), "")
        }
        words.toMutableList() = longTextOnAList
    }
}