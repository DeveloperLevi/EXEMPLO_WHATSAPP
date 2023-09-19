package com.example.exemplowhatsapp.ui.comunidades

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exemplowhatsapp.databinding.FragmentComunidadesBinding
import com.example.exemplowhatsapp.ui.adapter.AdapterComunidades
import com.example.exemplowhatsapp.ui.model.ModelComunidades

class ComunidadesFragment : Fragment() {

    private var _binding:  FragmentComunidadesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentComunidadesBinding.inflate(inflater, container, false)
        val root: View = binding.root


        binding.rvComunidades.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterComunidades(ModelComunidades().loadModelComunidades())
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}