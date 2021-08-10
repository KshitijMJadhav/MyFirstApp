package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    Button enterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.nameInput);
        enterBtn= findViewById(R.id.button);

    }

    public void welcomeActivity(View view) {

        String name = etName.getText().toString().trim();


        if (etName.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please Enter your Name", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Welcome " + name, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("name", name);


            startActivity(intent);

        }
    }
}