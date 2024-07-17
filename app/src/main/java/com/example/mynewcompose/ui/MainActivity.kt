package com.example.mynewcompose.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewcompose.ui.theme.MyNewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyNewComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    MySuperText("JOSESITO")
                }
            }
        }
    }
}

@Preview(
    name = "My Super Text",
    showBackground = true,
    showSystemUi = true,
    apiLevel = 33,
    device = Devices.NEXUS_5
)
@Composable
fun MyTestSuperText() {
    MySuperText("JOSEEE")
}


@Composable
fun MySuperText(name: String) {
    Text(text = "SOY $name :D", modifier = Modifier
        .fillMaxHeight()
        .padding(horizontal =16.dp)
        .clickable { } )
}


@Composable
fun GreetingPreview() {
    MyNewComposeTheme {
        Greeting("Android")
    }
}