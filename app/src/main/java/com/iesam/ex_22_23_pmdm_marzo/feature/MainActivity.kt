package com.iesam.ex_22_23_pmdm_marzo.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iesam.ex_22_23_pmdm_marzo.R
import com.iesam.ex_22_23_pmdm_marzo.feature.data.AdoptionsDataRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adoptions_view)

        val repo = AdoptionsDataRepository()
        repo.getAdoptions()
        repo.getDetailAdoption(1)
    }
}