package com.spot.mobignosis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    public static String TAG = HomeActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.e(TAG,"homeactivity started");

        String name = getIntent().getExtras().getString(MainActivity.KEY);
        TextView naTextView = findViewById(R.id.textViewResult);
        naTextView.setText(name);
    }
}
