package com.example.textcomposableeg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          SetContent()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun SetContent(){
        Column {
            Text(text = "Normal")
            Text(text = "Text Size", fontSize = 40.sp)
            Text(text = "Text Color", color = colorResource(id = R.color.sample))
            Text(text = "Bold Text", fontWeight = FontWeight.Bold)
            Text(text = "Italic Text", fontStyle = FontStyle.Italic)
            Text(text = "maxLines".repeat(300), maxLines = 2)
            Text(text = "overflow".repeat(300), maxLines = 1, overflow = TextOverflow.Ellipsis)
            SelectionContainer {
                Text(text = "Selectable Text")
            }
        }
    }



}