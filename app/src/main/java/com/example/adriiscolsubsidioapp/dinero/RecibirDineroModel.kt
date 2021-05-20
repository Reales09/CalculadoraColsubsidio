package com.example.adriiscolsubsidioapp.dinero

import android.util.Log
import androidx.lifecycle.ViewModel

class RecibirDineroModel (recibirdinero: Long): ViewModel() {

    // valor total
    var recibir =recibirdinero
    init {
        Log.i("RecibirDineroViewModel","Recibbir dinero es de $recibirdinero")
    }
}