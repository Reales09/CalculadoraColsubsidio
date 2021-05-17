package com.example.adriiscolsubsidioapp.dinero

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

import com.example.adriiscolsubsidioapp.R
import com.example.adriiscolsubsidioapp.databinding.FragmentRecibirDineroBinding

class RecibirDineroFragment : Fragment() {

    lateinit var viewModel: RecibirDineroModel
    lateinit var viewModelFactory: ReciterDinerModelFactory



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentRecibirDineroBinding = DataBindingUtil.inflate(
         inflater,
            R.layout.fragment_recibir_dinero, container,
            false)



        viewModelFactory = ReciterDinerModelFactory(RecibirDineroFragmentArgs.fromBundle(requireArguments()).recibirdinero)
        viewModel = ViewModelProvider(this, viewModelFactory)
            .get(RecibirDineroModel::class.java)



        binding.recibirDinero.text = viewModel.totalDefi.toString()

        return binding.root

    }


}