package com.example.myapplicationtheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interface2.ui.theme.Interface2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Interface2Theme{
                Surface (modifier = Modifier.fillMaxSize()) {
                    QuadrantApp()

                }
            }
        }
    }
}

@Composable
fun QuadrantApp() {
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        //premiere ligne
        Row(
            modifier = Modifier.weight(1f)
        ) {
            //premier cadrant
            Column(
                modifier = Modifier
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
                    .fillMaxSize().weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "Displays text and follows the recommended Material Design guidelines.",
                    fontSize = 16.sp
                )
            }

            //deuxieme cadrant
            Column(
                modifier = Modifier
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
                    .fillMaxSize().weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Image composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "Creates a composable that lays out and draws a given Painter class object.",
                    fontSize = 16.sp
                )
            }
        }

        //deuxieme ligne
        Row(
            modifier = Modifier.weight(1f)
        ) {
            //premier cadrant
            Column(
                modifier = Modifier
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
                    .fillMaxSize().weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Row composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "A layout composable that places its children in a horizontal sequence.",
                    fontSize = 16.sp
                )
            }

            //deuxieme cadrant
            Column(
                modifier = Modifier
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
                    .fillMaxSize().weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Column composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "A layout composable that places its children in a vertical sequence.",
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Composable
fun Quadrant(title: String, description: String, backgroundColor: Color, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.Yellow)
            .padding(16.dp)
            .fillMaxSize(),
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true,showSystemUi = true)
@Composable
fun QuadrantAppPreview() {
    Interface2Theme {
        QuadrantApp()
    }
}