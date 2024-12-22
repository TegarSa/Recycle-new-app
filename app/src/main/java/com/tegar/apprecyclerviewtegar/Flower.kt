package com.tegar.apprecyclerviewtegar

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Flower(
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable
