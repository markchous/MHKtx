package com.markhouston.mhktx

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Mark.Houston on 8/9/2018
 */

/**
 * Inflate layout for ViewGroup.
 * @param Int The layout resource that you would like to inflate on the ViewGroup.
 * @param Boolean Whether or not the inflated view should be added to the hierarchy of the root.
 * @return The view inflated into the ViewGroup.
 */
fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}