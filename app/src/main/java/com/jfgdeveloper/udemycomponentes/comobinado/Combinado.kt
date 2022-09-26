package com.jfgdeveloper.udemycomponentes.comobinado

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Combinado() {
    Column(Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ){
            Text(text = "ejem ejercicio")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ){
            Box(modifier =
                Modifier
                    .weight(1f)
                    .background(Color.Red)
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ){
                Text(text = "EJEMPLO")
            }
            Box(modifier =
                Modifier
                    .weight(1f)
                    .background(Color.Yellow)
                    .fillMaxHeight()

            ){
                Text(text = "Ejm para el ejercicio", modifier = Modifier.align(alignment = Alignment.Center))
            }

        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Cyan),
            contentAlignment = Alignment.BottomCenter
        ){
            Text(text = "EJEM EJERCICIO JAVI")
        }
    }
}