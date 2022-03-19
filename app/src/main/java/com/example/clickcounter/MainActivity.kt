package com.example.clickcounter

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // sets up the count variable and sets it to 0 //
    var count = 0

    // overrides and starts the activity //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // setting up the function of the button so the counter goes up by 1 whenever we click //
    fun onTap(view: View){
        count++

        // makes the text change whenever the value of count changes  //
        val textview = findViewById(R.id.textView) as TextView
        textview.text = "You clicked $count times"
    }
}
