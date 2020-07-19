package com.quarkalchs.brainpeek

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class PeekerViewModel : ViewModel() {

    var longText = ""
    var longTextOnAList = mutableListOf<String>()
    var currentWord = MutableLiveData<String>()
    var totalWords = 0
    var currentPosition = 0
    var haveToDoYerThing = false // Esto se utiliza para que, si esta en true, ejecuta el metodo doYerThang que cambia las palabras de la lista.
    // cuando pasa a false se corta el thread.

    fun listify(a: String) {
        longText = a
        val words = longText.split("\\s+").toTypedArray()
        for (i in words.indices) {
            words[i] = words[i].replace("[^\\w]".toRegex(), "")
        }
        longTextOnAList = words.toMutableList()
    }

    suspend fun doYerThang(delayed: Long) {
        viewModelScope.launch {
            currentWord.value = longTextOnAList.get(currentPosition)
            delay(delayed)
            currentPosition++
        }
    }

    fun showWord() : LiveData<String> {
        return currentWord
    }
}