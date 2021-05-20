package com.example.adriiscolsubsidioapp.calculadora

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.adriiscolsubsidioapp.R
import com.example.adriiscolsubsidioapp.databinding.FragmentCalculadoraBinding
import com.example.adriiscolsubsidioapp.screen.TittleFragmentDirections


class CalculadoraFragment : Fragment() {

    private val args: CalculadoraFragmentArgs by navArgs()
    private lateinit var binding: FragmentCalculadoraBinding
    private lateinit var viewModel: CalculadoraModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View?

    {
        // Inflate the layout for this fragment
        val binding: FragmentCalculadoraBinding = DataBindingUtil.inflate(
        inflater,R.layout.fragment_calculadora, container, false)

        Log.i("GameFragment", "Called ViewModelProvider.get")
        viewModel = ViewModelProvider(this).get(CalculadoraModel::class.java)


        binding.idTextView.text="Hola ${args.nombre}"

        binding.idResultado.text="${args.nombre}"

        binding.idRecibTodos.text="R ${viewModel.totalValTodos.value}"

        binding.idResultado.text = "${args.nombre} Recibiras un valor de: ${viewModel.totaldefi.value}"


        binding.resultButton.setOnClickListener {
if (binding.idDinero.text.isEmpty() || binding.editNumPerso.text.isEmpty() || binding.idNumHijos.text.isEmpty() ){
    Toast.makeText(activity, "Debes de colocar datos en todos los campos", Toast.LENGTH_SHORT).show()

}else {
    viewModel.money.value=binding.idDinero.text.toString().toLong()
    viewModel.numPerso.value= (binding.editNumPerso.text.toString()).toLong()
    viewModel.totalValTodos.value = (viewModel.money.value?:0 / viewModel.numPerso.value!!)

    binding.idRecibTodos.text="R ${viewModel.totalValTodos.value}"

    viewModel.numHijos.value=binding.idNumHijos.text.toString().toLong()
    viewModel.totaldefi.value = viewModel.totalValTodos.value!! * viewModel.numHijos.value!!
    binding.idResultado.text = "${args.nombre} Recibiras un valor de: ${viewModel.totaldefi.value}"


}
        }

        return binding.root

    }

}

