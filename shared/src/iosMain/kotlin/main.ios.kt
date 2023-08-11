import moe.tlaster.precompose.PreComposeApplication

actual fun getPlatformName(): String = "iOS"

//fun MainViewController() = ComposeUIViewController { App() }
fun MainViewController() = PreComposeApplication(title = "") { App() }
