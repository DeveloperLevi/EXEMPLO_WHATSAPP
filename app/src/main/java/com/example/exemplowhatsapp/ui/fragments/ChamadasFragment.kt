package com.example.exemplowhatsapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exemplowhatsapp.databinding.FragmentChamadasBinding
import com.example.exemplowhatsapp.databinding.FragmentChamadasBinding.*
import com.example.exemplowhatsapp.ui.adapter.AdapterChamadas
import com.example.exemplowhatsapp.ui.model.ModelChamadas

/**
 * A simple [Fragment] subclass.
 * Use the [fragment_chamadas.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChamadasFragment : Fragment() {
    private var _binding: FragmentChamadasBinding? = null
    private val binding get() = _binding!!

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        arguments?.let {
         //   param1 = it.getString(ARG_PARAM1)
         //   param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = inflate(inflater, container, false)
        val root: View = binding.root

        // todo o codigo executado dentro do onCreateView deve ser antes do RETURN
        binding.rvChamadas.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterChamadas(context,ModelChamadas().loadModelChamadas())
        }

        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment_chamadas.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ChamadasFragment().apply {
                arguments = Bundle().apply {
                  //  putString(ARG_PARAM1, param1)
                  //  putString(ARG_PARAM2, param2)
                }
            }
    }
}