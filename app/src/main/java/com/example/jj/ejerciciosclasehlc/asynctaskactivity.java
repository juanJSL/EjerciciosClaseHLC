package com.example.jj.ejerciciosclasehlc;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

    public void calcularFactorial(View v) {
        int n = Integer.parseInt(String.valueOf(entrada.getText()));
        new Factorial().execute(n);
    }


    public class Factorial extends AsyncTask<Integer, Integer, Integer> {

        @Override
        protected Integer doInBackground(Integer... num) {
            int res = 1;
            for (int i = 1; i <= num[0]; i++) {
                res *= i;
                SystemClock.sleep(1000);
            }

            return res;
        }

        @Override
        protected void onPostExecute(Integer result) {
            salida.append("" + result);
        }

    }
}

