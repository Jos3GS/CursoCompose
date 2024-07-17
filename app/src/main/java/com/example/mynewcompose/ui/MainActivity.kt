package com.example.mynewcompose.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
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
    heightDp = 50,
    widthDp = 200,
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
    Text(text = "SOY $name :D")
}


@Composable
fun GreetingPreview() {
    MyNewComposeTheme {
        Greeting("Android")
    }
}