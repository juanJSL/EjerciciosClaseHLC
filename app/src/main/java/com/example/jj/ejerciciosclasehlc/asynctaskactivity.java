package com.example.jj.ejerciciosclasehlc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class asynctaskactivity extends AppCompatActivity {
    private EditText entrada;
    private TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asynctaskactivity);

        entrada = (EditText) findViewById(R.id.entrada);
        salida = (TextView) findViewById(R.id.salida);
    }
}
