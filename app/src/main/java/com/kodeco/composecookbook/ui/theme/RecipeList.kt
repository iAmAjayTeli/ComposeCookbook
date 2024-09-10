package com.kodeco.composecookbook.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kodeco.composecookbook.Recipe
import com.kodeco.composecookbook.RecipeCard
import com.kodeco.composecookbook.defaultRecipes

@Composable
fun RecipeList(recipes: List<Recipe>) {
    LazyColumn {
        items(recipes) {
            RecipeCard(recipe = it,androidx.compose.ui.Modifier.padding(15.dp))
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun RecipeListPreview() {
    RecipeList(defaultRecipes)
}