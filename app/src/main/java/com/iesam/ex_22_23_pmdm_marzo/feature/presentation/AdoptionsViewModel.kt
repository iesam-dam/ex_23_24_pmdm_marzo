package com.iesam.ex_22_23_pmdm_marzo.feature.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iesam.ex_22_23_pmdm_marzo.app.ErrorApp
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.AdoptionRepository
import kotlinx.coroutines.launch

class AdoptionsViewModel(
    private val repository:AdoptionRepository,
    ): ViewModel() {
    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> =_uiState
    fun obtainAdoptions(){
        _uiState.postValue(UiState())
        viewModelScope.launch {
            repository.getAdoptions().fold(
                {responseError(it)},
                {responseSuccess(it)}
            )
        }
    }

    private fun responseSuccess(adoptions: List<Adoption>) {
        _uiState.postValue(UiState(adoptionList = adoptions))
    }

    private fun responseError(errorApp: ErrorApp) {
        _uiState.postValue(UiState(error=errorApp))
    }
data class UiState(
    val error: ErrorApp?= null,
    val adoptionList: List<Adoption> = emptyList(),
    val isLoading: Boolean = true
)

}