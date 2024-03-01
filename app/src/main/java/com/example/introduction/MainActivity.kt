package com.example.introduction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.introduction.ui.theme.IntroductionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            IntroductionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Hello Android")
                    Layout();
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column{
        Text("Hello $name", modifier = Modifier);
        Text("Hello $name", modifier = Modifier);
        Text("Hello $name", modifier = Modifier);
    }
}

//Column 2 rows
@Composable
fun Layout(modifier: Modifier = Modifier){
    Column{
        Row{
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight(0.4f)
                .fillMaxWidth(0.5f)
                .border(BorderStroke(10.dp,Color.White))
            ){
            };
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight(0.4f)
                .fillMaxWidth()
                .border(BorderStroke(10.dp,Color.White))

            ){};
        }

        Row{
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight()
                .fillMaxWidth(0.5f)
                .border(BorderStroke(10.dp,Color.White))

            ){};
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight()
                .fillMaxWidth()
                .border(BorderStroke(10.dp,Color.White))

                ){};
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Layout();
}