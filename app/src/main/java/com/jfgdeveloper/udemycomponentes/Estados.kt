package com.jfgdeveloper.udemycomponentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Estados() {
    var numero = remember { mutableStateOf(0) }

    Column( Modifier.fillMaxSize()) {
        Button(onClick = { numero.value += 1 }) {
            Text(text = "SUMAR")
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "El numero a sumar es: ${numero.value}")

    }
}