package com.markhouston.mhktx

import android.content.Context
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.v4.content.ContextCompat
import android.util.DisplayMetrics

/**
 * Created by Mark.Houston on 8/9/2018
 */

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
 * Retrieve the display metrics of the device.
 * @return The display metrics of the device.
 */
fun Context.displayMetrics(): DisplayMetrics = resources.displayMetrics

/**
 * Retrieve the width pixels from the display metrics of the device.
 * @return The width pixels from the display metrics of the device.
 */
fun Context.displayWidth(): Int = displayMetrics().widthPixels

/**
 * Retrieve the height pixels from the display metrics of the device.
 * @return The height pixels from the display metrics of the device.
 */
fun Context.displayHeight(): Int = displayMetrics().heightPixels
