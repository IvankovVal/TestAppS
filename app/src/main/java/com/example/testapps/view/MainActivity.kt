package com.example.testapps.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.ModifierLocalReadScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import com.example.testapps.view.navigation.AppNavHost
import com.example.testapps.view.theme.Bordur
import com.example.testapps.view.theme.BottomDesk
import com.example.testapps.view.theme.NewsAppTheme
import com.example.testapps.viewmodel.NewsViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //---------------------------------
            NewsAppTheme {

                // val vmNews = ViewModelProvider(this)[NewsViewModel::class]
                val navController = rememberNavController()
                val contentResolver = contentResolver//передадим его в функцию регистрации

                Column() {
                    //объект viewModel закомментировал потому что какие-то проблемы с его созданием из провайдера
                    AppNavHost(
                        // vmNews,
                        navController
                        ,contentResolver
                    )
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(12f)

                    ) {


                    }
// Карточка для нижней навигации
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier

                            .weight(1f)
                            .background(color = BottomDesk)
                            .fillMaxWidth()
                            .border(width = 2.dp, color = Bordur)
                    ) {
                        Row()
                        {
//Кнопка1Главная------------------------------------------------------------------------------------
                            TextButton(
                                onClick = {
                                    navController.navigate(route = AppNavHost.Main.route) }
                            )
                            {
                                Text(text = "Главная",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
//Конец---------------------------------------------------------------------------------------------
//Кнопка2Услуги-------------------------------------------------------------------------------------
                            TextButton(
                                onClick = {navController.navigate(route = AppNavHost.Service.route) }
                            )
                            {
                                Text(text = "Услуги",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
//Конец---------------------------------------------------------------------------------------------
//Кнопка3Чат----------------------------------------------------------------------------------------
                            TextButton(
                                onClick = {
                                    navController.navigate(route = AppNavHost.Chat.route) }
                            )
                            {
                                Text(text = "Чат",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
//Конец---------------------------------------------------------------------------------------------
//Кнопка4Блог---------------------------------------------------------------------------------------
                            TextButton(
                                onClick = {

                                    navController.navigate(route = AppNavHost.Blog.route) }

                            )
                            {
                                Text(text = "Блог",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
//Конец---------------------------------------------------------------------------------------------
//Кнопка5Профиль------------------------------------------------------------------------------------
                            TextButton(
                                onClick = {navController.navigate(route = AppNavHost.Profile.route) }
                            )
                            {
                                Text(text = "Профиль",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
//Конец---------------------------------------------------------------------------------------------
                        }
                    }
//_________________
                }
            }
        }



    }
        }







//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    NewsAppTheme {
//        ("Android")
//    }
//}