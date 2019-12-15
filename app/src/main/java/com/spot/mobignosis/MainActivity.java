package com.spot.mobignosis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnFocusChangeListener, AdapterView.OnItemClickListener {
    public static String KEY = "myname";
    public static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"mainactivity was created");

        EditText namEditText = findViewById(R.id.editTextName);
        namEditText.setOnFocusChangeListener(this);
    }


    @Override
    protected void onStart() {
        super.onStart();
        ListView myListView = findViewById(R.id.mylistview);
        myListView.setOnItemClickListener(this);
    }

    public void handleClick(View view) {
       // Toast.makeText(this, "mobignosis", Toast.LENGTH_SHORT).show();

        switch (view.getId()){
            case R.id.buttonHome:
                launchHomeActivity();
                break;
            case R.id.buttondialer:
                launchDialerActivity();
                break;
        }

    }

    private void launchDialerActivity() {
        Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:123456789"));//implicit intent
        startActivity(dialIntent);
    }

    private void launchHomeActivity() {
        Log.e(TAG,"button clicked");

        EditText nameEditText;
        nameEditText = findViewById(R.id.editTextName);
        String name = "";
        name = nameEditText.getText().toString();
        Intent homeIntent = new Intent(MainActivity.this,HomeActivity.class);//explicit intent
        homeIntent.putExtra(KEY,name);
        Log.w(TAG,"starting home activity");

        startActivity(homeIntent);
    }

    @Override
    public void onFocusChange(View view, boolean isFocussed) {
        if(isFocussed){
            Toast.makeText(this, "is focussed", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "not focussed", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
        String text = (String) adapterView.getItemAtPosition(pos);
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater;
        menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         super.onOptionsItemSelected(item);
         switch (item.getItemId()){
             case R.id.log:
                 Log.i("MainActivity","logging out");

                 break;
             case R.id.set:
                 Log.i("MainActivity","settings");

                 break;
         }

        return true;
    }

    void add(int fno, int sno){}
}

