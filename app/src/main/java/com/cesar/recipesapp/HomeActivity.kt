package com.cesar.recipesapp

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cesar.recipesapp.adapter.MainCategoryAdapter
import com.cesar.recipesapp.adapter.SubCategoryAdapter
import com.cesar.recipesapp.model.DishType
import com.cesar.recipesapp.model.MainRecipesUiModel
import com.cesar.recipesapp.model.SubRecipesUiModel


class HomeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val mainRecyclerView: RecyclerView = findViewById(R.id.rv_main_category)

        val subRecyclerView: RecyclerView = findViewById(R.id.rv_sub_category)
        val mainRecipesAdapter by lazy { MainCategoryAdapter(layoutInflater, GlideImageLoader(this)) }
        val subRecipesAdapter by lazy { SubCategoryAdapter(layoutInflater, GlideImageLoader(this)) }
        mainRecyclerView.adapter = mainRecipesAdapter
        mainRecyclerView.layoutManager =
            LinearLayoutManager(
                this, LinearLayoutManager.HORIZONTAL,
                false
            )

        mainRecipesAdapter.setData(
            listOf(
                MainRecipesUiModel(DishType.Chicken, "https://raw.githubusercontent.com/coding-with-me/RecipeApp/master/app/src/main/res/drawable/cat_img.png"),
                MainRecipesUiModel(DishType.FastFood, "https://raw.githubusercontent.com/coding-with-me/RecipeApp/master/app/src/main/res/drawable/cat_img.png"),
                MainRecipesUiModel(DishType.Fish, "https://raw.githubusercontent.com/coding-with-me/RecipeApp/master/app/src/main/res/drawable/cat_img.png"),
                MainRecipesUiModel(DishType.Vegeterian, "https://raw.githubusercontent.com/coding-with-me/RecipeApp/master/app/src/main/res/drawable/cat_img.png")
            )
        )

        subRecyclerView.adapter = subRecipesAdapter
        subRecyclerView.layoutManager =
            LinearLayoutManager(
                this, LinearLayoutManager.HORIZONTAL,
                false
            )

        subRecipesAdapter.setData(listOf(
            SubRecipesUiModel("Chicken Shashlik","https://images.unsplash.com/photo-1580959375944-abd7e991f971?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=388&q=80"),
            SubRecipesUiModel("Ramen Noodles","https://images.unsplash.com/photo-1470324161839-ce2bb6fa6bc3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"),
            SubRecipesUiModel("Mexican Taco","https://images.unsplash.com/photo-1629793982144-00548a0c75cc?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"),
            SubRecipesUiModel("Turkish Delight","https://images.unsplash.com/photo-1482930172332-2293d7138235?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"),
            SubRecipesUiModel("Mutton Karahi","https://images.unsplash.com/photo-1606843046080-45bf7a23c39f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"),
        )
        )
    }
}