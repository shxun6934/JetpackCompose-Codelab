package com.shunichi.basic_codelab

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.shunichi.basic_codelab.ui.theme.BasicCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicCodelabTheme {
                MyApp()
            }
        }
    }
}

@Composable
private fun MyApp() {
    // TODO: OnBoardingScreen or Greetings
}

@Composable
private fun OnBoardingScreen(onContinueClicked: () -> Unit) {
    // TODO: on boarding
}

@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun OnBoardingPreview() {
    // TODO: Preview OnBoardingScreen
}

@Composable
private fun Greetings(names: List<String> = List(100) { "$it" }) {
    // TODO: list
}

@Composable
private fun Greeting(name: String) {
    // TODO: card item
}

@Composable
private fun CardContent(name: String) {
    // TODO: item content
}

@Preview(
    showBackground = true,
    widthDp = 320,
    uiMode = UI_MODE_NIGHT_YES,
    name = "DefaultPreviewDark"
)
@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    // TODO: Preview Greetings
}
