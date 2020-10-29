package com.ronem.privatelogcat

import android.content.Context
import android.widget.Toast

/**
 * Created by Ram Mandal(ram.mandal@8squarei.com) on 10/28/2020.
 * Programmed on Dell Xps 15 9560
 */

fun Context.showMessage(msg: String, lengthLong: Boolean = false) =
    Toast.makeText(this, msg, if (lengthLong) Toast.LENGTH_LONG else Toast.LENGTH_SHORT).show()