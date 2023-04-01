package com.example.testapps.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
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
            NewsAppTheme {

               // val vmNews = ViewModelProvider(this)[NewsViewModel::class]
                val navController = rememberNavController()
                val contentResolver = contentResolver//предадим его в функцию регистрации

                ConstraintLayout(modifier = Modifier.fillMaxSize()) {
                    val (mainCard) = createRefs()
                    val (menuCard) = createRefs()
                    Card(
                        modifier = Modifier
                            .constrainAs(mainCard) {
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                                top.linkTo(parent.top)
                                bottom.linkTo(menuCard.top)
                            }
                    ) {

                       //объект viewModel закомментировал потому что какие-то проблемы с его созданием из провайдера
                        AppNavHost(
                           // vmNews,
                            navController
                            ,contentResolver
                        )
                    }
// Карточка для нижней навигации
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .constrainAs(menuCard) {
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                                top.linkTo(mainCard.bottom)
                                bottom.linkTo(parent.bottom)
                            }
                            .background(color = BottomDesk)
                            .fillMaxWidth()
                    ) {

                        //Кнопки
                        TextButton(
                            onClick = {

                                navController.navigate(route = AppNavHost.Service.route) }

                        )
                    {
                            Text(text = "СЕРВИС",
                                fontSize = 42.sp,
                                modifier = Modifier.padding(24.dp)
                            )
                        }

                       }
                    }

                }
            }
        }
    }






@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NewsAppTheme {
        ("Android")
    }
}