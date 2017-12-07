package com.example.jj.ejerciciosclasehlc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirRunOnUi(View v){
        Intent i = new Intent(this, HilosConUI.class);
        startActivity(i);
    }
    public void abrirHandler(View v){
        Intent i = new Intent(this, HandlerActivity.class);
        startActivity(i);
    }

    public void abrirPost(View v){
        Intent i = new Intent(this, HandlerActivity.class);
        startActivity(i);
    }
}
