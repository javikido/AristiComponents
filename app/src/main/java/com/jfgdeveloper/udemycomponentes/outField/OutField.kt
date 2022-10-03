package com.jfgdeveloper.udemycomponentes.outField

import android.util.Log
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Preview(showBackground = true)
@Composable
fun MyOutField() {
    var valor by remember { mutableStateOf("") }

    OutlinedTextField(value = valor,
          onValueChange = {
              valor = if (it.length < 3) {
                  Log.d("javi", "Valor no valido")
                  "Menor de 3 no valido"
              } else
                  it
          },
          colors = TextFieldDefaults.outlinedTextFieldColors(
                  focusedBorderColor = Color.Green,
                  unfocusedBorderColor = Color.Blue
          )
    )
}