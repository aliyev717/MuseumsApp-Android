package com.teyyub.muzeapp.data.model

import com.google.gson.annotations.SerializedName

data class Museum(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String?,
    @SerializedName("description") val description: String?,
    @SerializedName("address") val address: String?,
    @SerializedName("workingTime") val workingTime: String?,
    @SerializedName("details") val details: String?,
    @SerializedName("latitude") val latitude: Double?,
    @SerializedName("longitude") val longitude: Double?,
    @SerializedName("phone") val phone: String?,
    @SerializedName("email") val email: String?,
    @SerializedName("website") val website: String?,
    @SerializedName("city") val city: String?,
    @SerializedName("district") val district: String?
)

data class MuseumResponse(
    @SerializedName("status") val status: String,
    @SerializedName("message") val message: String,
    @SerializedName("rowCount") val rowCount: Int,
    @SerializedName("data") val data: List<Museum>?
)
