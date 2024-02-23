package com.iesam.ex_22_23_pmdm_marzo.feature.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.iesam.ex_22_23_pmdm_marzo.databinding.ViewAdoptionItemBinding
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption

class AdoptionViewHolder(private val view: View): ViewHolder(view) {

    private val binding = ViewAdoptionItemBinding.bind(view)

    fun render(adoption: Adoption){
        binding.apply {
            itemTitle.text = adoption.namePet
            itemDesc.text = adoption.shortDescription
            itemGenre.text = adoption.sex
            itemDateBorn.text = adoption.dateBorn
        }

    }
}