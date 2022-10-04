package com.jfgdeveloper.udemycomponentes.buttons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun Buttons() {

    var valor by rememberSaveable { mutableStateOf(true)}
    Column(Modifier.fillMaxSize()) {

        Button(onClick = { valor = false },
                modifier = Modifier.padding(12.dp),
               colors = ButtonDefaults.buttonColors(
                       backgroundColor = Color.Blue,
                       contentColor = Color.Green,
                       disabledBackgroundColor = Color.Gray,
                       disabledContentColor = Color.DarkGray

               ),
               enabled = valor

        ) {
            Text(text = "Ejemplo Button")
        }


        OutlinedButton(onClick = { valor = false },
                       modifier = Modifier.padding(12.dp),
                       /**
                       colors = ButtonDefaults.buttonColors(
                               backgroundColor = Color.Blue,
                               contentColor = Color.Green,
                               disabledBackgroundColor = Color.Gray,
                               disabledContentColor = Color.DarkGray

                       )
                       **/
                       enabled = valor
        ) {
            Text(text = "EJEMPLO DE BUTTON")
        }

        TextButton(onClick = { valor = false },modifier = Modifier.padding(12.dp)) {
            Text(text = "EJEMPLO DEL TEXTO")
        }
    }
}