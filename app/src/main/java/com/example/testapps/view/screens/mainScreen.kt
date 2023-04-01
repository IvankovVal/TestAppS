package com.example.testapps.view.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.testapps.view.theme.NewsAppTheme
import com.example.testapps.viewmodel.NewsViewModel


@Composable
fun MainScreen (
    navController: NavHostController,
   // viewModel: NewsViewModel,
){
    Text(text = "Главный экран")
}
@Preview
@Composable
fun PrevserviceScreen(){
    NewsAppTheme {
        MainScreen (navController = rememberNavController(),
           // viewModel = NewsViewModel()
        )
    }
}