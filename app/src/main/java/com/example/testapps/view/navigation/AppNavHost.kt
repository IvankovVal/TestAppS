package com.example.testapps.view.navigation

import android.content.ContentResolver
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testapps.view.screens.*

sealed class AppNavHost(val route: String) {
    object Main: AppNavHost("start_screen")
    object Service: AppNavHost("registration_screen")
    object Chat: AppNavHost("add_news_screen")
    object Blog: AppNavHost("edit_news_screen")
    object Profile: AppNavHost("edit_screen")
}

@Composable
fun AppNavHost(
// пока без viewmodel
//    mViewModel: NewsViewModel,
    navController: NavHostController,
    conRez: ContentResolver
) {
    val navController = rememberNavController()
//в параметры NavHost передать navController, который создан выше и наш стартовый экран
    NavHost(navController = navController, startDestination = AppNavHost.Main.route) {
//route означает ссылка, в фигурных скобках задаём то, куда она ведёт destination

        composable(AppNavHost.Main.route){MainScreen(
            navController = navController
           // viewModel = mViewModel
        )}
        composable(AppNavHost.Service.route){ ServiceScreen(
            navController = navController
//            viewModel = mViewModel,
//            contentResolver = conRez,
//            isRegistration = true
        ) }//Для регистрации
        composable(AppNavHost.Profile.route){ ProfileChat(
            navController = navController
//            viewModel = mViewModel,
//            contentResolver = conRez,
//            isRegistration = false
        ) }//Для редактирования
        composable(AppNavHost.Chat.route){ СhatScreen(
            navController = navController
//            viewModel = mViewModel,
//            contentResolver = conRez,
//            isAddNews = true
        ) }//Для добавления новости
        composable(AppNavHost.Blog.route){ BlogScreen(
            navController = navController,
//            viewModel = mViewModel,
//            contentResolver = conRez,
//            isAddNews = false
        ) }//Для редактирования новости
    }
}