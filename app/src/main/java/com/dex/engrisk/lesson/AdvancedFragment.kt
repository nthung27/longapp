package com.dex.engrisk.lesson

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dex.engrisk.R
import com.dex.engrisk.databinding.FragmentAdvancedBinding

class AdvancedFragment : Fragment() {

    private lateinit var binding: FragmentAdvancedBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentAdvancedBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        setupClickListeners()
    }

    private fun setupClickListeners() {

        binding.cardAI.setOnClickListener {

            val bundle = bundleOf(
                "lessonId" to "advanced_01"
            )

            findNavController().navigate(
                R.id.translateFragment,
                bundle
            )
        }

        binding.cardSpace.setOnClickListener {

            val bundle = bundleOf(
                "lessonId" to "advanced_02"
            )

            findNavController().navigate(
                R.id.translateFragment,
                bundle
            )
        }

        binding.cardCareer.setOnClickListener {

            val bundle = bundleOf(
                "lessonId" to "advanced_03"
            )

            findNavController().navigate(
                R.id.listenFillBlankFragment,
                bundle
            )
        }

        binding.cardGlobal.setOnClickListener {

            val bundle = bundleOf(
                "lessonId" to "advanced_04"
            )

            findNavController().navigate(
                R.id.listenChooseCorrectFragment,
                bundle
            )
        }
    }
}