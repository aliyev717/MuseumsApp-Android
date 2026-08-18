package com.teyyub.muzeapp.data.model

import com.google.gson.annotations.SerializedName

data class City(
    @SerializedName("cities") val name: String,
    @SerializedName("slug") val slug: String
)

data class CitiesResponse(
    @SerializedName("status") val status: String,
    @SerializedName("message") val message: String,
    @SerializedName("rowCount") val rowCount: Int,
    @SerializedName("data") val data: List<City>?
)
