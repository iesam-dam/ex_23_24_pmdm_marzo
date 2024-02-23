package com.iesam.ex_22_23_pmdm_marzo.feature.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iesam.ex_22_23_pmdm_marzo.app.ErrorApp
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.GetAdoptionsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AdoptionViewModel @Inject constructor(private val getAdoptionsUseCase: GetAdoptionsUseCase) :
    ViewModel() {

    private var _uiState = MutableLiveData<AdoptionUiState>()
    val uiState: LiveData<AdoptionUiState> = _uiState

    fun loadAdoptions() {
        val feed = getAdoptionsUseCase.invoke()
        viewModelScope.launch(Dispatchers.IO) {
            feed.fold(
                { responseError(it) },
                { responseSuccess(it) }
            )
        }
    }


    private fun responseError(error: ErrorApp) {
        _uiState.postValue(AdoptionUiState(error = error))
    }

    private fun responseSuccess(adoptionList: List<Adoption>) {
        _uiState.postValue(AdoptionUiState(adoptionList = adoptionList))
    }


    data class AdoptionUiState(
        var isLoading: Boolean = false,
        val error: ErrorApp? = null,
        val adoptionList: List<Adoption> = emptyList()
    )
}