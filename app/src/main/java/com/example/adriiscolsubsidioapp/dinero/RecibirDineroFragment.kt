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

lateinit var viewModel: RecibirDineroModel
lateinit var viewModelFactory: ReciterDinerModelFactory

class RecibirDineroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentRecibirDineroBinding = DataBindingUtil.inflate(
         inflater,
            R.layout.fragment_recibir_dinero, container,
            false)

        viewModelFactory = ReciterDinerModelFactory(RecibirDineroFragmentArgs.fromBundle(requireArguments()).recibir)
        viewModel = ViewModelProvider(this, viewModelFactory)
            .get(RecibirDineroModel::class.java)



        binding.recibirDinero.text = viewModel.recibir.toString()

        return binding.root

    }


}