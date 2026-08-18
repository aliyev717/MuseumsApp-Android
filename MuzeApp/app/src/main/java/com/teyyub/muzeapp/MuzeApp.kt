package com.teyyub.muzeapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Hilt-in proyekti tanimasi ucun bu annotation vacibdi.
 * Manifestde android:name=".MuzeApp" kimi qeyd olunub.
 */
@HiltAndroidApp
class MuzeApp : Application()
