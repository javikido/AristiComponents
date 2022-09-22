package com.jfgdeveloper.udemycomponentes.row

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import javax.sql.RowSet

@Composable
fun MyRows() {
    Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
        Text(text = "ejemplo para javi", modifier = Modifier.width(100.dp))
        Text(text = "ejemplo para javi",modifier = Modifier.width(100.dp))
        Text(text = "ejemplo para javi",modifier = Modifier.width(100.dp))
        Text(text = "ejemplo para javi",modifier = Modifier.width(100.dp))
        Text(text = "ejemplo para javi",modifier = Modifier.width(100.dp))
        Text(text = "ejemplo para javi",modifier = Modifier.width(100.dp))

    }
}