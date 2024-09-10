package com.kodeco.composecookbook

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kodeco.composecookbook.ui.theme.ComposeCookbookTheme

@Composable
fun RecipeList(recipe: List<Recipe>){
    LazyColumn {
        items(recipe){
            RecipeCard(it, Modifier.padding(15.dp))
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Preview(){
  ComposeCookbookTheme {
      RecipeList(defaultRecipes)
  }
}