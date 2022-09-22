package com.jfgdeveloper.udemycomponentes.colum

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyColums() {
    Column(modifier =
           Modifier
               .fillMaxSize()
               .verticalScroll(rememberScrollState()),
           verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
                text = "esto son ejemplos para javi",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Red
        )
        Text(
                text = "esto son ejemplos para javi",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Blue
        )
        Text(
                text = "esto son ejemplos para javi",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Yellow
        )
        Text(
                text = "esto son ejemplos para javi",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Yellow
        )
        Text(
                text = "esto son ejemplos para javi",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Yellow
        )
        Text(
                text = "esto son ejemplos para javi",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Yellow
        )
        Text(
                text = "esto son ejemplos para javi",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Yellow
        )
        Text(
                text = "esto son ejemplos para javi",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Yellow
        )
        Text(
                text = "esto son ejemplos para javi",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Yellow
        )
        Text(
                text = "esto son ejemplos para javi",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Yellow
        )
        Text(
                text = "esto son ejemplos para javi",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Yellow
        )
        Text(
                text = "esto son ejemplos para javi",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Yellow
        )
        Text(
                text = "esto son ejemplos para javi",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Yellow
        )

    }
}