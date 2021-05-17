package com.example.adriiscolsubsidioapp.dinero

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ReciterDinerModelFactory (private val recibirdinero: Long) :ViewModelProvider.Factory{


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
    if (modelClass.isAssignableFrom(RecibirDineroModel::class.java)){
        return RecibirDineroModel(recibirdinero) as T
    }
    throw IllegalArgumentException("Unknown ViewModel class")
   }
}