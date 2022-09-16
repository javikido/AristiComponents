package com.jfgdeveloper.udemycomponentes.box

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

// SOLO EXISTE LA JERARQUIA PADRE DEL PADRE
//EL BOX ALINEA EL BOX PERO NO AL TEXTO
// AL TEXTO LO ALINEA SU BOX PADRE

@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Box(modifier = Modifier.background(Color.Cyan)){
            Text(text = "EJEMPLO DEL ALINEAR UN COMPONENTE")
        }
    }

}