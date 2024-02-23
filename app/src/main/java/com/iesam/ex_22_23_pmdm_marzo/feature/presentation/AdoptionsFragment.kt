package com.iesam.ex_22_23_pmdm_marzo.feature.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.iesam.ex_22_23_pmdm_marzo.R
import com.iesam.ex_22_23_pmdm_marzo.app.mock.obtainJsonFromRaw
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AdoptionsFragment: Fragment(R.layout.adoptions_list_view) {


     override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val itemView = R.id.name
         val datos = obtainJsonFromRaw()
        for (dato in datos){

        }
    }
}