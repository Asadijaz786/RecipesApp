package com.cesar.recipesapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.cesar.recipesapp.R
import com.cesar.recipesapp.model.DishType
import com.cesar.recipesapp.model.MainRecipesUiModel
import com.cesar.recipesapp.ImageLoader

class MainRecipesViewHolder (
    containerView: View,
    private val imageLoader: ImageLoader
):
    ViewHolder(containerView){
    private val dishTypeView: TextView by lazy { containerView.findViewById(R.id.tv_dish_type) }
    private val foodTypeImageView: ImageView by lazy { containerView.findViewById(R.id.item_food_photo) }

    fun bindData(mainRecipesData: MainRecipesUiModel) {
        imageLoader.loadImage(mainRecipesData.mainDishImgUrl,foodTypeImageView)
        dishTypeView.text = when (mainRecipesData.mainDishType) {
            DishType.Chicken -> "Chicken"
            DishType.Fish -> "Sea Food"
            DishType.FastFood -> "Fast Food"
            DishType.Vegeterian -> "Vegetables"
        }

    }

    }


