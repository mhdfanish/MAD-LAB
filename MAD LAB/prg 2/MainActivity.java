package com.example.activitylifecycle;

// Package name of the application

import android.content.Intent;
import android.os.Bundle;
import android.util.Log; // Imports Log class to display messages in Logcat
import android.view.View; // Imports View class for handling button click events
import android.widget.Button; // Imports Button class
import android.widget.Toast; // Imports Toast class to display popup messages

import androidx.appcompat.app.AppCompatActivity;

// MainActivity is the first screen of the application

public class MainActivity extends AppCompatActivity {

    // Called when the activity is created for the first time
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Calls the parent class onCreate()
        setContentView(R.layout.activity_main); // Connects this Java file with activity_main.xml

        Button btn; // Declares a Button variable
        btn = findViewById(R.id.button); // Finds the button from XML using its ID

        // Sets a click listener for the button
        btn.setOnClickListener(new View.OnClickListener() {

            // Executes when the button is clicked
            @Override
            public void onClick(View view) {
                btnOnclick(); // Calls the method to open the second activity
            }
        });

        Log.i("my tag", "oncreate"); // Prints "oncreate" in Logcat
        Toast.makeText(this, "oncreate", Toast.LENGTH_SHORT).show();
    }

    // User-defined method to open the second activity
    private void btnOnclick() {
        Intent intent = new Intent(this, activity_main2.class);
        startActivity(intent); // Starts the second activity
    }

    // Called when the stopped activity starts again
    @Override
    protected void onRestart() {
        super.onRestart(); // Calls the parent class onRestart()
        Log.i("my tag", "onrestart"); // Prints "onrestart" in Logcat
        Toast.makeText(this, "onrestart", Toast.LENGTH_SHORT).show();
    }

    // Called when the activity becomes visible
    @Override
    protected void onStart() {
        super.onStart(); // Calls the parent class onStart()
        Log.i("my tag", "onstart"); // Prints "onstart" in Logcat
        Toast.makeText(this, "onstart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("my tag", "onresume");
        Toast.makeText(this, "onresume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("my tag", "onpause");
        Toast.makeText(this, "onpause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("my tag", "onstop");
        Toast.makeText(this, "onstop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("my tag", "ondestroy");
        Toast.makeText(this, "ondestroy", Toast.LENGTH_SHORT).show();
    }
}