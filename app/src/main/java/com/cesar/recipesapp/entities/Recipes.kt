package com.cesar.recipesapp.entities

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName="Recipes")
data class Recipes (
    @PrimaryKey(autoGenerate=true)
    var id:Int,
    @ColumnInfo(name="dishName")
    var dishName: String

):Serializable
