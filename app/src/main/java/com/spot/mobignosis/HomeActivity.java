package com.spot.mobignosis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       String name = getIntent().getExtras().getString("myname");
        TextView naTextView = findViewById(R.id.textViewResult);
        naTextView.setText(name);
    }
}
