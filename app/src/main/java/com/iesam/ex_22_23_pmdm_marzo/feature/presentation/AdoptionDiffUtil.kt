package com.iesam.ex_22_23_pmdm_marzo.feature.presentation

import androidx.recyclerview.widget.DiffUtil
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption


class AdoptionDiffUtil() : DiffUtil.ItemCallback<Adoption>() {

     override fun areItemsTheSame(oldItemPosition: Adoption, newItemPosition: Adoption): Boolean {
        return oldItemPosition==newItemPosition
    }

     override fun areContentsTheSame(oldItemPosition: Adoption, newItemPosition: Adoption): Boolean {
         return oldItemPosition.id==newItemPosition.id
     }




}