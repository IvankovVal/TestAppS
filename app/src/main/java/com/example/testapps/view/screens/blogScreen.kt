package com.example.testapps.view.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.testapps.view.theme.NewsAppTheme
import com.example.testapps.viewmodel.NewsViewModel


@Composable
fun BlogScreen (
    navController: NavHostController,
   // viewModel: NewsViewModel,
){
    Text(text = "Блог")
}
@Preview
@Composable
fun `PrevBlogScreen`(){
    NewsAppTheme {
        BlogScreen (navController = rememberNavController(),
          //  viewModel = NewsViewModel()
        )
    }
}