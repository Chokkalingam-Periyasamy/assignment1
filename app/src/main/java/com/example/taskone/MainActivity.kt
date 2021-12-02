package com.example.taskone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickYellow= findViewById<TextView>(R.id.yellowBtn);
        val displayView=findViewById<TextView>(R.id.clickView);
        val clickBlue = findViewById<TextView>(R.id.blueGreenBtn);
        val clickCoral=findViewById<TextView>(R.id.coralBtn);

        clickYellow.setOnClickListener {
            displayView.text="Green Clicked"
        }
        clickBlue.setOnClickListener {
            displayView.text="Blue Green Clicked"
        }
        clickCoral.setOnClickListener {
            displayView.text="Coral Clicked"
        }

    }


}