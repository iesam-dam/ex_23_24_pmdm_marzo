package com.iesam.ex_22_23_pmdm_marzo.feature.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.iesam.ex_22_23_pmdm_marzo.databinding.AdoptionItemBinding
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption
import com.iesam.ex_22_23_pmdm_marzo.feature.presentation.AdoptionDiffUtil


class AdoptionsRecyclerViewAdapter(
    private val adoptions: List<Adoption>
) : ListAdapter<Adoption, AdoptionViewHolder>(AdoptionDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdoptionViewHolder {
        return AdoptionViewHolder(
            AdoptionItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            parent
        )
    }
    override fun onBindViewHolder(holder: AdoptionViewHolder, position: Int) {
        holder.binds()
    }


    override fun getItemCount(): Int = adoptions.size

//    inner class ViewHolder(binding: AdoptionItemBinding) : RecyclerView.ViewHolder(binding.root) {
//        val idView: TextView = binding.itemNumber
//        val contentView: TextView = binding.content
//
//        override fun toString(): String {
//            return super.toString() + " '" + contentView.text + "'"
//        }
//    }

}