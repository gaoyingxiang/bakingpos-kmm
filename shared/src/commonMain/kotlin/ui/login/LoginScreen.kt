package ui.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text("我是登录页面", modifier = Modifier.clickable {

        }, style = TextStyle(fontSize = 18.sp))
    }
}