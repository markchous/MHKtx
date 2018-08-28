package com.markhouston.mhktx

import android.app.NotificationManager
import android.content.Context
import android.net.ConnectivityManager
import android.os.PowerManager
import android.os.UserManager
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.v4.content.ContextCompat
import android.util.DisplayMetrics
import android.view.WindowManager

/**
 * Created by Mark.Houston on 8/9/2018
 */

inline val Context.windowManger
    get() = getSystemService(Context.WINDOW_SERVICE) as WindowManager?

inline val Context.powerService
    get() = getSystemService(Context.POWER_SERVICE) as PowerManager?

inline val Context.notificationManger
    get() = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager?

inline val Context.connectivityManager
    get() = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?

inline val Context.userManager
    get() = getSystemService(Context.USER_SERVICE) as UserManager?

inline val Context.displayMetrics: DisplayMetrics
    get() = resources.displayMetrics

/**
 * Retrieve a color resource.
 * @param Int The resource id binded to the color you want to use.
 * @return Int The color being retrieved.
 */
fun Context.getColorCompat(@ColorRes colorRes: Int) = ContextCompat.getColor(this, colorRes)

/**
 * Retrieve a drawable resource.
 * @param Int The resource id binded to the drawable you want to use.
 * @return Drawable The Drawable being retrieved.
 */
fun Context.getDrawableCompat(@DrawableRes drawableRes: Int) = ContextCompat.getDrawable(this, drawableRes)

/**
 * Retrieve the width pixels from the display metrics of the device.
 * @return The width pixels from the display metrics of the device.
 */
fun Context.displayWidth(): Int = displayMetrics.widthPixels

/**
 * Retrieve the height pixels from the display metrics of the device.
 * @return The height pixels from the display metrics of the device.
 */
fun Context.displayHeight(): Int = displayMetrics.heightPixels
