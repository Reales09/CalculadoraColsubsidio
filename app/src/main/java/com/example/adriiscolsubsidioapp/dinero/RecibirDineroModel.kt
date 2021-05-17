package com.example.adriiscolsubsidioapp.dinero

import android.util.Log
import androidx.lifecycle.ViewModel

class RecibirDineroModel (recibirDinero: Long): ViewModel() {

    var totalDefi =recibirDinero
    init {
        Log.i("RecibirDineroViewModel","Recibbir dinero es de $totalDefi")
    }
}