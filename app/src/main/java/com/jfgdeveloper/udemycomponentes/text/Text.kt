package com.jfgdeveloper.udemycomponentes.text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MyText() {
    Column(Modifier.fillMaxSize()) {

        Text(text = "Ejemplo de letras")
        Text(text = "Ejemplo de letras", color = Color.Green)
        Text(text = "Ejemplo de letras", fontWeight = FontWeight.ExtraBold)
        Text(text = "Ejemplo de letras", fontWeight = FontWeight.Light)
        Text(text = "Ejemplo de letras", fontFamily = FontFamily.Cursive)
        Text(text = "Ejemplo de letras", textDecoration = TextDecoration.LineThrough)
        Text(text = "Ejemplo de letras", textDecoration = TextDecoration.Underline)
        Text(text = "Ejemplo de letras", textDecoration = TextDecoration.combine(listOf(
                TextDecoration.LineThrough, TextDecoration.Underline
        )))
        Text(text = "Ejemplo de letras", fontSize = 30.sp)


    }
}