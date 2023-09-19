package com.example.exemplowhatsapp.ui.conversas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exemplowhatsapp.databinding.FragmentConversasBinding
import com.example.exemplowhatsapp.ui.adapter.AdapterConversas
import com.example.exemplowhatsapp.ui.model.ModelConversas

class ConversasFragment : Fragment() {

    private var _binding: FragmentConversasBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentConversasBinding.inflate(inflater, container, false)
        val root: View = binding.root


        // daqui pra baixo e o codigo do onCreateView

        binding.rvConversas.apply {
            //e sempre necessario aplicar o layout Maneger e o adapter para listar
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterConversas(ModelConversas().loadModelConversas())
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}