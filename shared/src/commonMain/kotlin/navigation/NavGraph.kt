package navigation

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import ui.WelcomeScreen
import ui.login.LoginScreen

sealed class NavigationScreenRoute(val route: String) {
    //欢迎洁面
    data object WelcomeScreenRoute : NavigationScreenRoute("WelcomeScreenRoute")

    //登录
    data object LoginScreenRoute : NavigationScreenRoute("LoginScreenRoute")

    //门店
    data object StoreScreenRoute : NavigationScreenRoute("StoreScreenRoute")

    //店铺
    data object ShopScreenRoute : NavigationScreenRoute("ShopScreenRoute")

    //首页
    data object HomeScreenRoute : NavigationScreenRoute("HomeScreenRoute")
}

@Composable
fun Navigation(navigator: Navigator) {
    NavHost(navigator = navigator, initialRoute = NavigationScreenRoute.WelcomeScreenRoute.route) {
        //欢迎
        scene(route = NavigationScreenRoute.WelcomeScreenRoute.route) {
            WelcomeScreen(navigator = navigator)
        }
        //登录
        scene(route = NavigationScreenRoute.LoginScreenRoute.route) {
            LoginScreen()
        }
        //门店
        scene(route = NavigationScreenRoute.StoreScreenRoute.route) {

        }
        //店铺
        scene(route = NavigationScreenRoute.ShopScreenRoute.route) {

        }
        //首页
        scene(route = NavigationScreenRoute.HomeScreenRoute.route) {

        }
    }
}