package com.spot.mobignosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleClick(View view) {
       // Toast.makeText(this, "mobignosis", Toast.LENGTH_SHORT).show();
        EditText nameEditText;
        nameEditText = findViewById(R.id.editTextName);
        String name = "";
        name = nameEditText.getText().toString();
        Intent homeIntent = new Intent(MainActivity.this,HomeActivity.class);
        homeIntent.putExtra("myname",name);
        startActivity(homeIntent);
    }
}
