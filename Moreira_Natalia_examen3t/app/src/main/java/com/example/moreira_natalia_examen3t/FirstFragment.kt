package com.example.moreira_natalia_examen3t

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.moreira_natalia_examen3t.SpinnerProvider.Companion.listaEstilos
import com.example.moreira_natalia_examen3t.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        //llamamos las funciones de abajo
        cargarSpinner()
        funcionSpinner()
    }

    // función para cargar el spinner con la lista de géneros que creamos en SpinnerProvider
    fun cargarSpinner(){
        binding.spinnerId.adapter = ArrayAdapter<String>(
            requireContext(),
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            listaEstilos
        )
        binding.spinnerId.setSelection(0, false)
    }

    // función para agregar funcionalidades al spinner
    fun funcionSpinner(){
        binding.spinnerId.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                // esto muestra el nombre
                binding.txtTexto.setText(binding.spinnerId.selectedItem.toString())
                // esto muestra la posición en el array
                //binding.txtTexto.setText(binding.spinnerId.selectedItemPosition.toString())
                // esto muestra el id
                //binding.txtTexto.setText(binding.spinnerId.selectedItemId.toString())

                // mostramos un toast al seleccionar un género
                Toast.makeText(
                    binding.root.context,
                    binding.spinnerId.selectedItem.toString(),
                    Toast.LENGTH_SHORT).show()

                // mostramos un snackbar
                //Snackbar.make(binding.root, "Mensaje", Snackbar.LENGTH_LONG).show()

                // mostramos una alerta
                //AlertDialog.Builder(binding.root.context).setMessage("Mensaje").setTitle("Título").create().show()

            }
            // esto no sabemos que hace pero se deja vacío. Alejandro tampoco sabe
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}