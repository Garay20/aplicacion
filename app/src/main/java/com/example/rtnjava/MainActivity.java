package com.example.rtnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void accion1 (View view){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);

    }

    public void accion2 (View view){
        Intent i = new Intent(this, MainActivity3.class);
        startActivity(i);

    }
    public void accion3 (View view){
        Intent i = new Intent(this, MainActivity4.class);
        startActivity(i);

    }
    public void accion4 (View view){
        Intent i = new Intent(this, MainActivity5.class);
        startActivity(i);

    }



}