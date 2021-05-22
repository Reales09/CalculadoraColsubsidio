package com.example.adriiscolsubsidioapp.dinero

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel

class RecibirDineroModel (recibirdinero: Long): ViewModel() {

    // valor total
    var recibir =recibirdinero


    init {
        Log.i("RecibirDineroViewModel","Recibir dinero es de $recibirdinero")

    }

}