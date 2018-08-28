package com.markhouston.mhktx

import android.content.Context
import android.view.View
import android.view.View.*
import android.view.inputmethod.InputMethodManager

/**
 * Created by Mark.Houston on 8/9/2018
 */

/**
 * Show keyboard for the View.
 */
fun View.showKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    requestFocus()
    imm.showSoftInput(this, 0)
}

/**
 * Hide keyboard for the View.
 * @return Whether or not the keyboard was hidden.
 */
fun View.hideKeyboard(): Boolean {
    return try {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    } catch (e: RuntimeException) {
        false
    }
}

/**
 * Hide a view using the visibility values GONE or INVISIBLE.
 * @param gone Determine if the visibility should be set to GONE OR INVISIBLE.
 */
fun View.hide(gone: Boolean) {
    visibility = if (gone) GONE else INVISIBLE
}

/**
 * Show a view by setting it's visibility to VISIBLE.
 */
fun View.show() {
    visibility = VISIBLE
}