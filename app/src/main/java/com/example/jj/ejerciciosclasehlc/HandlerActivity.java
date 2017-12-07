package com.example.jj.ejerciciosclasehlc;

import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HandlerActivity extends AppCompatActivity {
    private EditText entrada;
    private TextView salida;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        handler = new Handler();
        entrada = (EditText) findViewById(R.id.entradaHandler);
        salida = (TextView) findViewById(R.id.salidaHandler);
    }



    public void calcularOperacionHandler(View view) {
        int n = Integer.parseInt(entrada.getText().toString());
        salida.append(n + "! = ");
        HandlerActivity.MiThread thread = new HandlerActivity.MiThread(n);
        thread.start();
    }

    public int factorial(int n) {
        int res=1;
        for (int i=1; i<=n; i++){
            res*=i;
            SystemClock.sleep(1000);
        }

        return res;

    }

    class MiThread extends Thread {
        private int n, res;


        public MiThread(int n) {
            this.n = n;
        }

        @Override
        public void run() {
            res=factorial(n);
            handler.post(new Runnable() {
                @Override public void run() {
                    salida.append(res + "\n");
                }
            });
        }
    }

}


