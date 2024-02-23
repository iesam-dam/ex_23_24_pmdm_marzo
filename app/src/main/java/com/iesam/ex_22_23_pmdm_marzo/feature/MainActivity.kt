package com.iesam.ex_22_23_pmdm_marzo.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iesam.ex_22_23_pmdm_marzo.R
import com.iesam.ex_22_23_pmdm_marzo.feature.data.AdoptionsDataRepository
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adoptions_list_view)

        val repo = AdoptionsDataRepository()
        repo.getAdoptions()
        repo.getDetailAdoption(1)
    }
}