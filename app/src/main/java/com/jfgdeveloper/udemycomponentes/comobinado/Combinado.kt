package com.jfgdeveloper.udemycomponentes.comobinado

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Combinado() {
    Column(Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Cyan)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ){
            Box(modifier =
                Modifier.weight(1f).background(Color.Red).fillMaxHeight()
            )
            Box(modifier =
                Modifier.weight(1f).background(Color.Black).fillMaxHeight()
            )

        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Cyan)
        )
    }
}