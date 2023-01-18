package com.example.lab2part2

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("STATE", lifecycle.currentState.toString())
        Log.d("STATE", "onCreate")
        val showButton : Button = this.findViewById(R.id.btnShow)
        val textField : TextView = this.findViewById(R.id.recipeText)
        showButton.setOnClickListener{
            if(textField.visibility == View.VISIBLE){
            textField.visibility = View.INVISIBLE
            } else  {
                textField.visibility = View.VISIBLE
            }
        }
    }
}