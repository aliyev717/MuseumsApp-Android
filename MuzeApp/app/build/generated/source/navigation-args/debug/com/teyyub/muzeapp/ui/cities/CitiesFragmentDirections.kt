package com.teyyub.muzeapp.ui.cities

import android.os.Bundle
import androidx.navigation.NavDirections
import com.teyyub.muzeapp.R
import kotlin.Int
import kotlin.String

public class CitiesFragmentDirections private constructor() {
  private data class ActionCitiesFragmentToMuseumsFragment(
    public val citySlug: String,
    public val cityName: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_citiesFragment_to_museumsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("citySlug", this.citySlug)
        result.putString("cityName", this.cityName)
        return result
      }
  }

  public companion object {
    public fun actionCitiesFragmentToMuseumsFragment(citySlug: String, cityName: String):
        NavDirections = ActionCitiesFragmentToMuseumsFragment(citySlug, cityName)
  }
}
