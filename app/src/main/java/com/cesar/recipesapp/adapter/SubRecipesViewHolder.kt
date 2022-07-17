package com.cesar.recipesapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.cesar.recipesapp.R
import com.cesar.recipesapp.model.DishType
import com.cesar.recipesapp.model.MainRecipesUiModel
import com.cesar.recipesapp.ImageLoader
import com.cesar.recipesapp.model.SubRecipesUiModel

class SubRecipesViewHolder (
    containerView: View,
    private val imageLoader: ImageLoader
):
    ViewHolder(containerView){
    private val dishNameView: TextView by lazy { containerView.findViewById(R.id.tv_dish_name) }
    private val foodImageView: ImageView by lazy { containerView.findViewById(R.id.item_dish_photo) }

    fun bindData(subRecipesData: SubRecipesUiModel) {
        imageLoader.loadImage(subRecipesData.subRecipeImgUrl,foodImageView)
        dishNameView.text = subRecipesData.subRecipeName

    }

    }


