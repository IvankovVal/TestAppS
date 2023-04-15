package com.example.testapps.view.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
    Column {
        Text(text = "Самый главный экран")

    }
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