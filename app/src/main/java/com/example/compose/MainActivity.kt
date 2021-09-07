package com.example.compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme
import com.example.compose.ui.theme.MyColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Column() {
                        Greeting("Android", MyColor().Purple200)
                        MyButton(name = "Studio")
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, color: Color) {
    Text(text = "Hello $name!",color = color)
}

@Composable
fun MyButton(name: String) {
    Button(onClick = {
        Log.d("Hello","World")
    }) {
        Greeting(name = "button $name",color = MyColor().Teal200)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTheme {
        Greeting("Android", MyColor().Purple200)
    }
}

@Preview(showBackground = true)
@Composable
fun SecondPreview() {
    ComposeTheme {
        MyButton(name = "Studio")
    }
}