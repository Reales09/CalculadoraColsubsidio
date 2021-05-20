package com.example.adriiscolsubsidioapp.calculadora

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculadoraModel : ViewModel() {


    //variables movidas del fragment
    var money = MutableLiveData<Long>()
    var numPerso= MutableLiveData<Long>()
    var totalValTodos=MutableLiveData<Long>()
    var numHijos=MutableLiveData<Long>()
    var totaldefi= MutableLiveData<Long>()

    init {
        money.value=0
        numPerso.value=0
        totalValTodos.value=0
        numHijos.value=0
        totaldefi.value=0

    }

}