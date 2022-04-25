package com.mobile.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hairstyle(
    val imgHairstyle: Int,
    val nameHairstyle: String,
    val descHairstyle:  String
) : Parcelable
