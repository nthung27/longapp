package com.dex.engrisk.lesson

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dex.engrisk.databinding.FragmentIntermediateBinding
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.dex.engrisk.R
class IntermediateFragment : Fragment() {

    private lateinit var binding: FragmentIntermediateBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentIntermediateBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cardTravel.setOnClickListener {

            val bundle = bundleOf(
                "lessonId" to "intermediate_01"
            )

            findNavController().navigate(
                R.id.action_to_translateFragment,
                bundle
            )
        }

        binding.cardRestaurant.setOnClickListener {

            val bundle = bundleOf(
                "lessonId" to "intermediate_02"
            )

            findNavController().navigate(
                R.id.action_to_listenFillBlankFragment,
                bundle
            )
        }

        binding.cardTechnology.setOnClickListener {

            val bundle = bundleOf(
                "lessonId" to "intermediate_03"
            )

            findNavController().navigate(
                R.id.action_to_listenChooseCorrectFragment,
                bundle
            )
        }
    }
}