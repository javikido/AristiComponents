package com.jfgdeveloper.udemycomponentes.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jfgdeveloper.udemycomponentes.R


@Preview(showBackground = true)
@Composable
fun MyImage() {
    Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(Modifier.fillMaxWidth()) {
            Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "ejem",
                    tint = Color.Magenta
            )
        }
        Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "ejem",
                modifier = Modifier.clip(RoundedCornerShape(12.dp))
        )

        Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "ejem",
                modifier = Modifier
                    .clip(CircleShape)
                    .border(5.dp, Color.Blue)
        )

    }

}