package com.example.testapps.view.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.testapps.view.theme.NewsAppTheme
import com.example.testapps.viewmodel.NewsViewModel


@Composable
fun ProfileChat (
    navController: NavHostController,
   //viewModel: NewsViewModel,
){
    Text(text = "Профиль")
}
@Preview
@Composable
fun `PrevProfileChat`(){
    NewsAppTheme {
        BlogScreen (navController = rememberNavController(),
          //  viewModel = NewsViewModel()
        )
    }
}