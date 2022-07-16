package com.cesar.recipesapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cesar.recipesapp.R
import com.cesar.recipesapp.model.DishType
import com.cesar.recipesapp.model.MainRecipesUiModel
import com.nostra13.universalimageloader.core.ImageLoader

class MainCategoryAdapter (
    private val layoutInflater: LayoutInflater,
    private val imageLoader: ImageLoader
    ) : RecyclerView.Adapter<RecipesViewHolder>() {
        private  val recipesData = mutableListOf<MainRecipesUiModel>()
        fun setData(mainRecipesData: List<MainRecipesUiModel>) {
            this.recipesData.clear()
            this.recipesData.addAll(mainRecipesData)
           // notifyDataSetChanged()
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
                RecipesViewHolder {
            val view = layoutInflater.inflate(
                R.layout.item_rv_main_category,
                parent, false)
            return RecipesViewHolder(view, imageLoader)
        }
        override fun getItemCount() = recipesData.size

        override fun onBindViewHolder(holder: RecipesViewHolder, position:Int) {
            holder.bindData(recipesData[position])
        }
    }
class RecipesViewHolder (
    containerView: View,
    private var imageLoader: ImageLoader
    ): RecyclerView.ViewHolder(containerView){
    private val dishTypeView: TextView by lazy { containerView.findViewById(R.id.tv_dish_type) }
    private val foodTypeImageView: ImageView= containerView.findViewById(R.id.img_dish)

    fun bindData(mainRecipesData: MainRecipesUiModel){

        imageLoader.loadImage(mainRecipesData.dishImgUrl,foodTypeImageView)
        dishTypeView.text=when (mainRecipesData.dishType){
            DishType.Chicken->"Chicken"
            DishType.Drink->"Drink"
            DishType.FastFood->"Fast Food"
            DishType.Vegeterian->"Vegetables"
        }



    }
    }

