package com.example.kartheek.startactivityforresultexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SendData extends AppCompatActivity {

    EditText editText,editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_data);
        editText = (EditText)findViewById(R.id.user);
        editText1 = (EditText)findViewById(R.id.pass);

    }

    public void sendDataBack(View view) {

        String name=editText.getText().toString().trim();
        String pass=editText1.getText().toString().trim();

        Intent intent = new Intent();
        intent.putExtra("user",name);
        intent.putExtra("pass",pass);

        setResult(RESULT_OK,intent);
        finish();


    }
}
