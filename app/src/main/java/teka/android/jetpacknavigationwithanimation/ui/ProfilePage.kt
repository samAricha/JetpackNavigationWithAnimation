package teka.android.jetpacknavigationwithanimation.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import teka.android.jetpacknavigationwithanimation.ScreensRoutes

@Composable
fun ProfilePage(navController: NavController){
    Text(text = "Profile Page")
    Row(
        horizontalArrangement = Arrangement.End
    ){
        Button(
            onClick = {
                navController.navigate(ScreensRoutes.FriendsList.route)
            },
            modifier = Modifier.padding(horizontal = 0.dp).width(155.dp),
        ) {
            Text(text = "ToFriendsList")
        }
    }

    
}