package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Enter(View view){
        TextView Login= findViewById(R.id.logText);
        TextView Password= findViewById(R.id.pasText);

        if(Login.getText().toString().equals("user")&&Password.getText().toString().equals("123")) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
    }
}