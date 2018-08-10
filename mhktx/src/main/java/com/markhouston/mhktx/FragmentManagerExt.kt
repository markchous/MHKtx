package com.markhouston.mhktx

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction

/**
 * Created by Mark.Houston on 8/9/2018
 */

/**
 * Perform a transaction on the FragmentManager allowing state loss.
 * @param FragmentTransaction the transaction you'd like to perform on the FragmentManager.
 */
fun FragmentManager.transactAllowingStateLoss(action: FragmentTransaction.() -> Unit) {
    beginTransaction().apply {
        action()
    }.commitAllowingStateLoss()
}

/**
 * Perform a transaction on the FragmentManager.
 * @param FragmentTransaction the transaction you'd like to perform on the FragmentManager.
 */
fun FragmentManager.transact(action: FragmentTransaction.() -> Unit) {
    beginTransaction().apply {
        action()
    }.commit()
}