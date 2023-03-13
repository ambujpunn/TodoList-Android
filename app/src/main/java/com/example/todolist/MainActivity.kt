package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Activity is just a single screen in Android (similar to view controller)
class MainActivity : AppCompatActivity() {
    // called once the activity is created
    // in android, we design UI with XML
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // set the content view to the layout of the xml file
        setContentView(R.layout.activity_main)
    }
}