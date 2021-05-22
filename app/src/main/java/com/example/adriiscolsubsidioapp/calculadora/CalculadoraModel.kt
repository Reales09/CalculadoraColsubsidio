package com.example.adriiscolsubsidioapp.calculadora

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculadoraModel : ViewModel() {

    //variables movidas del fragment
    private val _money = MutableLiveData<Long>()
    val money: LiveData<Long>
    get() = _money

    private val _numPerso= MutableLiveData<Long>()
    val numPerso:LiveData<Long>
    get() = _numPerso


    private val _totalValTodos=MutableLiveData<Long>()
    val totalValTodos: LiveData<Long>
    get() = _totalValTodos

    private val _numHijos=MutableLiveData<Long>()
    val numHijos: LiveData<Long>
    get()=_numHijos

    private val _totaldefi= MutableLiveData<Long>()
    val totaldefi: LiveData<Long>
    get() = _totaldefi


    init {
        _money.value=0
        _numPerso.value=0
        _totalValTodos.value=0
        _numHijos.value=0
        _totaldefi.value=0

    }

}