package com.kodeco.composecookbook

import androidx.annotation.DrawableRes

data class Recipe (
    @DrawableRes val foodImage:Int,
    val title:String,
    val ingredients:List<String>,
    val description:String
)
