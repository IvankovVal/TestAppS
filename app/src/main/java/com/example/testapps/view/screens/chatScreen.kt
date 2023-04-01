package com.example.testapps.view.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.testapps.view.theme.NewsAppTheme
import com.example.testapps.viewmodel.NewsViewModel


@Composable
fun СhatScreen (
    navController: NavHostController,
   // viewModel: NewsViewModel,
){
    Text(text = "Чат")
}
@Preview
@Composable
fun `PrevСhatScreen`(){
    NewsAppTheme {
        СhatScreen (navController = rememberNavController(),
           // viewModel = NewsViewModel()
        )
    }
}