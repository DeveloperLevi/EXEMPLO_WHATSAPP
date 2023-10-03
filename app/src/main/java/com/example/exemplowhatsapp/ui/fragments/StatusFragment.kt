package com.example.exemplowhatsapp.ui.fragments

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exemplowhatsapp.databinding.FragmentStatusBinding
import com.example.exemplowhatsapp.ui.adapter.AdapterStatus
import com.example.exemplowhatsapp.ui.model.ModelStatus

class StatusFragment : Fragment() {

    private var _binding: FragmentStatusBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentStatusBinding.inflate(inflater, container, false)
        val root: View = binding.root

       // binding.fabWriter.startAnimation(
       //     AnimationUtils.loadAnimation(context, R.anim.fade_teste) )
       //binding.fabWriter.forceHasOverlappingRendering(true)

        // outra maneira se execultar uma animação
       ObjectAnimator.ofFloat(binding.fabWriter, "translationY", 0f, -190f).apply {
           duration = 500
           start()
       }

        binding.rvStatus.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterStatus(ModelStatus().loadModelStatus())
        }
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}