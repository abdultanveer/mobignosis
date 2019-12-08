package com.spot.mobignosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleClick(View view) {
       // Toast.makeText(this, "mobignosis", Toast.LENGTH_SHORT).show();
        Intent homeIntent = new Intent(MainActivity.this,HomeActivity.class);
        homeIntent.putExtra("myname","abdul");
        startActivity(homeIntent);
    }
}
