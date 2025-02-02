package c.m.dicodingmadefavorite.util

import android.annotation.SuppressLint
import android.view.View
import java.text.SimpleDateFormat
import java.util.*

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

@SuppressLint("SimpleDateFormat")
fun simpleDateFormat(originalDate: String): String {
    val inputFormat = SimpleDateFormat("yyyy-MM-dd")
    val outputFormat = SimpleDateFormat("EEEE, dd MMM yyy")
    val date = inputFormat.parse(originalDate)
    return outputFormat.format(date as Date)
}
