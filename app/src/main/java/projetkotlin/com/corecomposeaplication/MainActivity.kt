package projetkotlin.com.corecomposeaplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainSreen()
        }
    }
}

@Composable
fun MainSreen() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalColoredBar(Color.Red)
            HorizontalColoredBar(Color.Magenta)
            HorizontalColoredBar(Color.Cyan)
            HorizontalColoredBar(Color.Yellow)
            HorizontalColoredBar(Color.Blue)
        }
    }
}

@Composable
fun HorizontalColoredBar(mColor: Color) {
    Surface(
        color = mColor,
        modifier = Modifier
            .height(100.dp)
            .width(358.dp)
    ) {
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainSreen()
}