package com.example.rtnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        textView = findViewById(R.id.textinscipcion);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

    public void atras1 (View View){
        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);
        finish();
    }

}