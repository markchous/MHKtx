package com.markhouston.mhktx

import android.support.v7.widget.SearchView

/**
 * Reduce some of the boiler plate code when making listeners for SearchViews.
 * @param CompletionHandler The method in charge of how to handle onQueryTextChange.
 * @param CompletionHandler The method in charge of how to handle onQueryTextSubmit.
 */
fun SearchView.onQueryText(change: (newText: String?) -> Unit, submit: (query: String?) -> Unit) {
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
