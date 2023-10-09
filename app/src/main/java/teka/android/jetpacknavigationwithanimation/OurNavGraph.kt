package teka.android.jetpacknavigationwithanimation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import teka.android.jetpacknavigationwithanimation.animations.scaleIntoContainer
import teka.android.jetpacknavigationwithanimation.animations.scaleOutOfContainer
import teka.android.jetpacknavigationwithanimation.ui.FriendsList
import teka.android.jetpacknavigationwithanimation.ui.ProfilePage

@Composable
fun OurNavGraph() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreensRoutes.ProfilePage.route) {
        composable(
            route = ScreensRoutes.ProfilePage.route,
            enterTransition = {
                scaleIntoContainer()
            },
            exitTransition = {
                scaleOutOfContainer(direction = AnimatedContentTransitionScope.SlideDirection.Right)
            },
            popEnterTransition = {
                scaleIntoContainer(direction = AnimatedContentTransitionScope.SlideDirection.Left)
            },
            popExitTransition = {
                scaleOutOfContainer()
            }
        ) {
            ProfilePage(navController)
        }

        composable(
            route = ScreensRoutes.FriendsList.route,
            enterTransition = {
                scaleIntoContainer()
            },
            exitTransition = {
                scaleOutOfContainer(direction = AnimatedContentTransitionScope.SlideDirection.Right)
            },
            popEnterTransition = {
                scaleIntoContainer(direction = AnimatedContentTransitionScope.SlideDirection.Left)
            },
            popExitTransition = {
                scaleOutOfContainer()
            }
        ) {
            FriendsList(navController)
        }

    }

}