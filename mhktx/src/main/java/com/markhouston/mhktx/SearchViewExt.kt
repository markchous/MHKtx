package com.markhouston.mhktx

import android.support.v7.widget.SearchView

/**
 * Reduce some of the boiler plate code when making listeners for SearchViews.
 * @param CompletionHandler The method in charge of how to handle onQueryTextChange.
 * @param CompletionHandler The method in charge of how to handle onQueryTextSubmit.
 */
inline fun SearchView.onQueryText(crossinline change: (newText: String?) -> Unit, crossinline submit: (query: String?) -> Unit) {
    setOnQueryTextListener(object : SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(query: String?): Boolean {
            submit(query)
            return false
        }

        override fun onQueryTextChange(newText: String?): Boolean {
            change(newText)
            return false
        }
    })
}
