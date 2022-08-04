package com.example.app_practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button btnVolver, btnCalcular;
    private EditText edt1, edt2;
    private TextView txtvres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnVolver = (Button) findViewById(R.id.btnVolver);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        txtvres = findViewById(R.id.txtvrest2);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(MainActivity2.this, MainActivity.class);
                finish();
                startActivity(volver);
            }
        });

    }

    public void Sumar(View view) {
        String valor1 = edt1.getText().toString();
        String valor2 = edt2.getText().toString();

        float a = Float.parseFloat(valor1);
        float b = Float.parseFloat(valor2);

        float suma = a + b;

        String res = String.valueOf(suma);

        txtvres.setText(res);

        Toast mensaje = Toast.makeText(this, "El resultado de " + a + " + " + b + " es: " + suma , Toast.LENGTH_SHORT);
        mensaje.show();
    }
}