package com.example.kartheek.startactivityforresultexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(R.string.activity);

    }

    public void openNext(View view) {
        Intent send = new Intent(getApplicationContext(),SendData.class);
        startActivityForResult(send,0);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        Bundle b=data.getExtras();
        String name = b.getString("user");
        String pass = b.getString("pass");


        Toast.makeText(this, " "+name+"\n"+pass, Toast.LENGTH_SHORT).show();
    }
}
