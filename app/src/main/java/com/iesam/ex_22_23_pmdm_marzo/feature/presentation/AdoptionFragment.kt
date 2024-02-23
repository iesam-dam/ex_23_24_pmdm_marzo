package com.iesam.ex_22_23_pmdm_marzo.feature.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.iesam.ex_22_23_pmdm_marzo.databinding.AdoptionFeedFragmentBinding
import com.iesam.ex_22_23_pmdm_marzo.feature.presentation.adapter.AdoptionAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AdoptionFragment: Fragment() {

    private var _binding: AdoptionFeedFragmentBinding? = null
    private val binding get() = _binding!!

    private val adoptionAdapter = AdoptionAdapter()
    private val viewModel by viewModels<AdoptionViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = AdoptionFeedFragmentBinding.inflate(inflater, container, false)
        setupView()
        return binding.root
    }

    private fun setupView(){
        binding.apply {
            listAdoptionsFeed.apply {

                adapter = adoptionAdapter
            }
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.loadAdoptions()
        setupObservers()

    }

    fun setupObservers(){
        val observer = Observer<AdoptionViewModel.AdoptionUiState> {
            if (it.isLoading){

            } else {
                if (it.error != null){

                } else{

                }
            }
        }
        viewModel.uiState.observe(viewLifecycleOwner, observer)
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}