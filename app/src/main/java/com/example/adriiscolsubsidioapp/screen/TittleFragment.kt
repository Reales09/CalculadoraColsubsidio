package com.example.adriiscolsubsidioapp.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.adriiscolsubsidioapp.R
import com.example.adriiscolsubsidioapp.databinding.FragmentTittleBinding

class TittleFragment : Fragment() {

    private lateinit var binding: FragmentTittleBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentTittleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_tittle, container, false
        )

        binding.irButton.setOnClickListener {

            if (binding.editNombre.text!!.isEmpty()) {

                binding.editNombre.error="Debes escribir un nombre"
                Toast.makeText(activity, "Escribe un nombre por favor", Toast.LENGTH_SHORT).show()
            } else {
                binding.editNombre.error=null
                val action = TittleFragmentDirections.actionTittleFragmentToCalculadoraFragment(binding.editNombre.text.toString())
                findNavController().navigate(action)

            }
        }

        return binding.root

    }


}

