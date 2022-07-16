package com.cesar.recipesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cesar.recipesapp.adapter.MainCategoryAdapter
import com.cesar.recipesapp.model.DishType
import com.cesar.recipesapp.model.MainRecipesUiModel

class HomeActivity: AppCompatActivity()
private val employeesAdapter by lazy {
    MainCategoryAdapter(layoutInflater, GlideImageLoader(this)) }
private val recyclerView:RecyclerView=  findViewById(R.id.main_recycler_view)
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_home)
    recyclerView.adapter = employeesAdapter
    recyclerView.layoutManager =
        LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,
            false)
    employeesAdapter.setData(
        listOf(
            MainRecipesUiModel(DishType.Vegeterian,"https://www.google.com"),
            MainRecipesUiModel(DishType.FastFood,""),
            MainRecipesUiModel(DishType.Drink,""),
            MainRecipesUiModel(DishType.Vegeterian,"")
        )
    )
}