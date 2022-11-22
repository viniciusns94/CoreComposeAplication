package projetkotlin.com.corecomposeaplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

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
        modifier = Modifier.fillMaxSize()) {
        Surface(
            color = Color.Magenta,
            modifier = Modifier.wrapContentSize()) {
            Text(
                text = "Wrap content",
                style = MaterialTheme.typography.headlineLarge)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainSreen()
}