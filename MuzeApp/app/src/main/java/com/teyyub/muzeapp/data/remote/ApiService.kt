package com.teyyub.muzeapp.data.remote

import com.teyyub.muzeapp.data.model.CitiesResponse
import com.teyyub.muzeapp.data.model.MuseumResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("museum/cities")
    suspend fun getCities(
        @Query("apiKey") apiKey: String
    ): CitiesResponse

    @GET("museum")
    suspend fun getMuseums(
        @Query("city") city: String,
        @Query("apiKey") apiKey: String
    ): MuseumResponse
}
