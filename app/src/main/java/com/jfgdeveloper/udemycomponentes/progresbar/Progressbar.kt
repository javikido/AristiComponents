package com.jfgdeveloper.udemycomponentes.progresbar

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyProgressBar() {

    var visivility by rememberSaveable { mutableStateOf(false)}
    Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(200.dp)
    ) {

        if (visivility) {

            CircularProgressIndicator(color = Color.Red, strokeWidth = 8.dp)
            LinearProgressIndicator(
                    Modifier.fillMaxWidth(),
                    color = Color.Red,
                    backgroundColor = Color.Blue
            )
        }

        Button(onClick = { visivility = !visivility}) {
            Text(text = "Progres Bar")
        }
    }
}