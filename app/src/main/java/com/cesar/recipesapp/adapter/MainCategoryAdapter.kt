package com.cesar.recipesapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cesar.recipesapp.GlideImageLoader
import com.cesar.recipesapp.R
import com.cesar.recipesapp.model.MainRecipesUiModel
import com.nostra13.universalimageloader.core.ImageLoader

class MainCategoryAdapter(
    private val layoutInflater: LayoutInflater,
    private val imageLoader: GlideImageLoader
    ) : RecyclerView.Adapter<MainRecipesViewHolder>() {
        private  val recipesData = mutableListOf<MainRecipesUiModel>()

        fun setData(mainRecipesData: List<MainRecipesUiModel>) {
            this.recipesData.clear()
            this.recipesData.addAll(mainRecipesData)
          //  notifyDataSetChanged()
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
                MainRecipesViewHolder {
            val view = layoutInflater.inflate(R.layout.item_rv_main_category, parent, false)
            return MainRecipesViewHolder(view, imageLoader)
        }
        override fun getItemCount() = recipesData.size

        override fun onBindViewHolder(holderMain: MainRecipesViewHolder, position:Int) {
            holderMain.bindData(recipesData[position])


            }
        }





