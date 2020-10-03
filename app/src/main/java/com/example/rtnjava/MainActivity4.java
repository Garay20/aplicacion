package com.example.rtnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView = findViewById(R.id.declaracion);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }

    public void atras3 (View View){
        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);
        finish();
    }

}