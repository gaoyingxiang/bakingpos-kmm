package ui
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import moe.tlaster.precompose.navigation.Navigator
import navigation.NavigationScreenRoute

@Composable
fun WelcomeScreen(navigator: Navigator) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text("我是欢迎页面", modifier = Modifier.clickable {
            navigator.navigate(NavigationScreenRoute.LoginScreenRoute.route)
        }, style = TextStyle(fontSize = 18.sp))
    }
}