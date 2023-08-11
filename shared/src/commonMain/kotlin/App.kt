import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.rememberNavigator
import navigation.Navigation

@Composable
fun App() {
    val navigator = rememberNavigator()
    MaterialTheme {
        Scaffold {
            Navigation(navigator = navigator)
        }
    }
}

expect fun getPlatformName(): String

