package com.kodeco.composecookbook

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RecipeCard(recipe: Recipe, modifier: Modifier) {

    Surface(
        color = MaterialTheme.colorScheme.surface,
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.secondary),
        tonalElevation = 2.dp,
        shadowElevation = 10.dp,
        modifier =modifier
    )
    {
        Column(
            Modifier.fillMaxWidth()
        )
        {
            Image(
                painter = painterResource(recipe.foodImage),
                contentDescription = recipe.description,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(144.dp)
            )

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column(
                    modifier = Modifier.padding(16.dp)
                )
                {
                    Text(
                        text = recipe.title,
                        style = MaterialTheme.typography.headlineLarge,
                        fontWeight = FontWeight(700)
                    )

                    for (ingredients in recipe.ingredients) {
                        Text(
                            text = "• $ingredients",
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                }

                Spacer(modifier = Modifier.height(42.dp))


                Text(
                    text = recipe.description,
                    modifier = Modifier.padding(16.dp)
                )

            }


        }
    }


}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun RecipeCardPreview() {
    RecipeCard(recipe = defaultRecipes[0], modifier = Modifier.padding(12.dp))
}