package com.example.testapps.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import com.example.testapps.view.navigation.AppNavHost
import com.example.testapps.view.theme.NewsAppTheme
import com.example.testapps.viewmodel.NewsViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsAppTheme {

               // val vmNews = ViewModelProvider(this)[NewsViewModel::class]
                val navController = rememberNavController()
                val contentResolver = contentResolver//предадим его в функцию регистрации

                Column() {


                }

                ConstraintLayout(modifier = Modifier.fillMaxSize()) {
                    val (mainCard) = createRefs()
                    Card(
                        modifier = Modifier
                            .constrainAs(mainCard) {
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                                top.linkTo(parent.top)
                                bottom.linkTo(parent.bottom)
                            }
                            .fillMaxSize(),
                    ) {
                       //объект viewModel закомментировал потому что какие-то проблемы с его созданием из провайдера
                        AppNavHost(
                           // vmNews,
                            navController
                            ,contentResolver
                        )
                    }

                }
            }
        }
    }
}



@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NewsAppTheme {
        Greeting("Android")
    }
}