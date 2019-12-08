package com.spot.mobignosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String KEY = "myname";
    public static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"mainactivity was created");
    }

    public void handleClick(View view) {
       // Toast.makeText(this, "mobignosis", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"button clicked");

        EditText nameEditText;
        nameEditText = findViewById(R.id.editTextName);
        String name = "";
        name = nameEditText.getText().toString();
        Intent homeIntent = new Intent(MainActivity.this,HomeActivity.class);
        homeIntent.putExtra(KEY,name);
        Log.w(TAG,"starting home activity");

        startActivity(homeIntent);
    }
}

