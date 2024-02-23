package com.iesam.ex_22_23_pmdm_marzo.feature.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.iesam.ex_22_23_pmdm_marzo.databinding.AdoptionItemBinding

class AdoptionViewHolder(
    private val adoptionItemBinding: AdoptionItemBinding,
    view: View
) : ViewHolder(view) {

    fun binds(){
        adoptionItemBinding.adoptionId.text // = adoption.id.toString()
    }

}