package teka.android.jetpacknavigationwithanimation

sealed class ScreensRoutes(val route: String) {
    object ProfilePage : ScreensRoutes(route = "profile_screen")
    object FriendsList : ScreensRoutes(route = "friends_list_screen")
}