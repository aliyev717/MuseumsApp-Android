package com.teyyub.muzeapp.ui.cities

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.teyyub.muzeapp.data.model.City
import com.teyyub.muzeapp.data.remote.ApiService
import com.teyyub.muzeapp.util.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CitiesViewModel @Inject constructor(
    private val apiService: ApiService
) : ViewModel() {

    private val _cities = MutableLiveData<List<City>>()
    val cities: LiveData<List<City>> = _cities

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    private val _error = MutableLiveData<String?>()
    val error: LiveData<String?> = _error

    fun loadCities() {
        viewModelScope.launch {
            _isLoading.value = true
            try {
                val response = apiService.getCities(Constants.API_KEY)
                _cities.value = response.data ?: emptyList()
            } catch (e: Exception) {
                _error.value = e.message ?: "Şəhərləri yükləyərkən xəta baş verdi"
            } finally {
                _isLoading.value = false
            }
        }
    }
}
