package com.cesar.recipesapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cesar.recipesapp.GlideImageLoader
import com.cesar.recipesapp.R
import com.cesar.recipesapp.model.SubRecipesUiModel

class SubCategoryAdapter(
    private val layoutInflater: LayoutInflater,
    private val imageLoader: GlideImageLoader
    ) : RecyclerView.Adapter<SubRecipesViewHolder>() {
        private  val subRecipesData = mutableListOf<SubRecipesUiModel>()

        fun setData(subRecipesData: List<SubRecipesUiModel>) {
            this.subRecipesData.clear()
            this.subRecipesData.addAll(subRecipesData)
          //  notifyDataSetChanged()
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
                SubRecipesViewHolder {
            val view = layoutInflater.inflate(R.layout.item_rv_sub_category, parent, false)
            return SubRecipesViewHolder(view, imageLoader)
        }
        override fun getItemCount() = subRecipesData.size

        override fun onBindViewHolder(holderMain: SubRecipesViewHolder, position:Int) {
            holderMain.bindData(subRecipesData[position])


            }
        }





