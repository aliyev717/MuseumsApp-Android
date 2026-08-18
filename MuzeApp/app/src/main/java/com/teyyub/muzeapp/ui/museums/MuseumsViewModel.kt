package com.teyyub.muzeapp.ui.museums

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.teyyub.muzeapp.data.model.Museum
import com.teyyub.muzeapp.data.remote.ApiService
import com.teyyub.muzeapp.util.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MuseumsViewModel @Inject constructor(
    private val apiService: ApiService
) : ViewModel() {

    private val _museums = MutableLiveData<List<Museum>>()
    val museums: LiveData<List<Museum>> = _museums

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    private val _error = MutableLiveData<String?>()
    val error: LiveData<String?> = _error

    fun loadMuseums(citySlug: String) {
        viewModelScope.launch {
            _isLoading.value = true
            try {
                val response = apiService.getMuseums(citySlug, Constants.API_KEY)
                _museums.value = response.data ?: emptyList()
            } catch (e: Exception) {
                _error.value = e.message ?: "Muzeyləri yükləyərkən xəta baş verdi"
            } finally {
                _isLoading.value = false
            }
        }
    }
}
