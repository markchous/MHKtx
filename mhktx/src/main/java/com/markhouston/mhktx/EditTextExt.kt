package com.markhouston.mhktx

import android.widget.EditText

/**
 * Created by Mark.Houston on 8/9/2018
 */

/**
 * Retrieve the String value of the text inside the EditText.
 * @return The String value of the text inside the EditText.
 */
val EditText.value
    get() = text.toString()