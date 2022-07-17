package com.cesar.recipesapp

import android.widget.ImageView


interface ImageLoader {
    fun loadImage(imageUrl: String, imageView: ImageView)
}