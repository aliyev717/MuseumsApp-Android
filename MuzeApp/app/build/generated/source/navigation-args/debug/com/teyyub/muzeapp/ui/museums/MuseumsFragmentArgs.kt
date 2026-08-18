package com.teyyub.muzeapp.ui.museums

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class MuseumsFragmentArgs(
  public val citySlug: String,
  public val cityName: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("citySlug", this.citySlug)
    result.putString("cityName", this.cityName)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("citySlug", this.citySlug)
    result.set("cityName", this.cityName)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): MuseumsFragmentArgs {
      bundle.setClassLoader(MuseumsFragmentArgs::class.java.classLoader)
      val __citySlug : String?
      if (bundle.containsKey("citySlug")) {
        __citySlug = bundle.getString("citySlug")
        if (__citySlug == null) {
          throw IllegalArgumentException("Argument \"citySlug\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"citySlug\" is missing and does not have an android:defaultValue")
      }
      val __cityName : String?
      if (bundle.containsKey("cityName")) {
        __cityName = bundle.getString("cityName")
        if (__cityName == null) {
          throw IllegalArgumentException("Argument \"cityName\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"cityName\" is missing and does not have an android:defaultValue")
      }
      return MuseumsFragmentArgs(__citySlug, __cityName)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): MuseumsFragmentArgs {
      val __citySlug : String?
      if (savedStateHandle.contains("citySlug")) {
        __citySlug = savedStateHandle["citySlug"]
        if (__citySlug == null) {
          throw IllegalArgumentException("Argument \"citySlug\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"citySlug\" is missing and does not have an android:defaultValue")
      }
      val __cityName : String?
      if (savedStateHandle.contains("cityName")) {
        __cityName = savedStateHandle["cityName"]
        if (__cityName == null) {
          throw IllegalArgumentException("Argument \"cityName\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"cityName\" is missing and does not have an android:defaultValue")
      }
      return MuseumsFragmentArgs(__citySlug, __cityName)
    }
  }
}
