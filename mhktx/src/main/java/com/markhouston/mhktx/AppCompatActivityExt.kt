package com.markhouston.mhktx

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by Mark.Houston on 8/9/2018
 */

/**
 * Extension to replace a fragment on a ViewGroup inside an AppCompatActivity.
 * @param Int The ViewGroup you intend to replace the fragment on.
 * @param Fragment The Fragment that you intend to replace on the ViewGroup.
 * @param String Optional tag name for the fragment, to later retrieve the fragment with.
 */
fun AppCompatActivity.replaceFragment(@IdRes container: Int, fragment: Fragment, tag: String? = null) {
    supportFragmentManager.transact {
        replace(container, fragment, tag)
    }
}

/**
 * Extension to replace a fragment on a ViewGroup inside an AppCompatActivity allowing state loss.
 * @param Int The ViewGroup you intend to replace the fragment on.
 * @param Fragment The Fragment that you intend to replace on the ViewGroup.
 * @param String Optional tag name for the fragment, to later retrieve the fragment with.
 */
fun AppCompatActivity.replaceFragmentAllowingStateLoss(@IdRes container: Int, fragment: Fragment, tag: String? = null) {
    supportFragmentManager.transactAllowingStateLoss {
        replace(container, fragment, tag)
    }
}

/**
 * Extension to add a fragment to a ViewGroup inside an AppCompatActivity.
 * @param Int The ViewGroup you intend to add the fragment on.
 * @param Fragment The Fragment that you intend to add to the ViewGroup.
 * @param String Optional tag name for the fragment, to later retrieve the fragment with.
 */
fun AppCompatActivity.addFragment(@IdRes container: Int, fragment: Fragment, tag: String? = null) {
    supportFragmentManager.transact {
        add(container, fragment, tag)
    }
}

/**
 * Extension to add a fragment to a ViewGroup inside an AppCompatActivity allowing state loss.
 * @param Int The ViewGroup you intend to add the fragment on.
 * @param Fragment The Fragment that you intend to add to the ViewGroup.
 * @param String Optional tag name for the fragment, to later retrieve the fragment with.
 */
fun AppCompatActivity.addFragmentAllowingStateLoss(@IdRes container: Int, fragment: Fragment, tag: String? = null) {
    supportFragmentManager.transactAllowingStateLoss {
        add(container, fragment, tag)
    }
}