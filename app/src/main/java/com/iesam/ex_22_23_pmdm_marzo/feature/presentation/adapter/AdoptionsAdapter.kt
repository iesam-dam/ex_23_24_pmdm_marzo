package com.iesam.ex_22_23_pmdm_marzo.feature.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iesam.ex_22_23_pmdm_marzo.R
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption

class AdoptionsAdapter(private val adoptions: Array<Adoption>): RecyclerView.Adapter<AdoptionsAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textView: TextView
        init {
            textView = view.findViewById(R.id.recycler_view)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdoptionsAdapter.ViewHolder{
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.adoption_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdoptionsAdapter.ViewHolder, position: Int) {
        holder.textView.text = adoptions[position].toString()
    }

    override fun getItemCount(): Int = adoptions.size

}