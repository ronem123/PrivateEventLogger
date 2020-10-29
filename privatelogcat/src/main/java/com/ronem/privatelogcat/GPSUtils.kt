package com.ronem.privatelogcat

import android.content.Context
import android.content.Intent
import android.location.LocationManager
import android.provider.Settings


/**
 * Created by Ram Mandal(ram.mandal@8squarei.com) on 10/29/2020.
 * Programmed on Dell Xps 15 9560
 */
object GPSUtils {
    fun isGpsEnabled(context: Context): Boolean {
        var isGpsEnabled = false
        val locationManager =
            context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        isGpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
        return isGpsEnabled
    }

    fun enableGps(context: Context) {
        context.startActivity(Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS))
    }
}