package com.iesam.ex_22_23_pmdm_marzo.feature.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.iesam.ex_22_23_pmdm_marzo.databinding.ViewAdoptionItemBinding

class AdoptionAdapter(): RecyclerView.Adapter<ViewHolder>() {

    private val dataSet
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(, parent, false
        )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}