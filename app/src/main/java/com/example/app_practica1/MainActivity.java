package com.example.app_practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSumar, btnRestar, btnMulti, btnDividir, btnLimpiar,btnSalir, btnSiguiente, btnSiguiente2;
    EditText edt1, edt2;
    TextView tvres;
    Operaciones op = new Operaciones();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.etv1);
        edt2 = findViewById(R.id.etv2);
        btnSumar = (Button) findViewById(R.id.btnsumar);
        btnRestar = (Button) findViewById(R.id.btnrestar);
        btnMulti = (Button) findViewById(R.id.btnmulti);
        btnDividir = (Button) findViewById(R.id.btndividir);
        tvres = findViewById(R.id.tvres);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnSalir = (Button) findViewById(R.id.btnSalir);
        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);
        btnSiguiente2 = (Button) findViewById(R.id.btnSiguiente2);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dato1 = edt1.getText().toString();
                String dato2 = edt2.getText().toString();
                if(dato1.length() == 0){
                    edt1.setError("Ingrese un dato en el campo");
                }else if(dato2.length() == 0){
                    edt2.setError("Ingrese un dato en el campo");
                }else{
                    op.setDato1(Double.parseDouble(dato1));
                    op.setDato2(Double.parseDouble(dato2));
                    tvres.setText(String.valueOf(op.sumar()));
                }

            }
        });
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dato1 = edt1.getText().toString();
                String dato2 = edt2.getText().toString();
                if(dato1.length() == 0){
                    edt1.setError("Ingrese un dato en el campo");
                }else if(dato2.length() == 0){
                    edt2.setError("Ingrese un dato en el campo");
                }else{
                    op.setDato1(Double.parseDouble(dato1));
                    op.setDato2(Double.parseDouble(dato2));
                    tvres.setText(String.valueOf(op.restar()));
                }

            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dato1 = edt1.getText().toString();
                String dato2 = edt2.getText().toString();
                if(dato1.length() == 0){
                    edt1.setError("Ingrese un dato en el campo");
                }else if(dato2.length() == 0){
                    edt2.setError("Ingrese un dato en el campo");
                }else{
                    op.setDato1(Double.parseDouble(dato1));
                    op.setDato2(Double.parseDouble(dato2));
                    tvres.setText(String.valueOf(op.multiplicar()));
                }

            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dato1 = edt1.getText().toString();
                String dato2 = edt2.getText().toString();
                if(dato1.length() == 0){
                    edt1.setError("Ingrese un dato en el campo");
                }else if(dato2.length() == 0){
                    edt2.setError("Ingrese un dato en el campo");
                }else{
                    op.setDato1(Double.parseDouble(dato1));
                    op.setDato2(Double.parseDouble(dato2));
                    tvres.setText(String.valueOf(op.dividir()));
                }

            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText("");
                edt2.setText("");
                tvres.setText("0.0");
            }
        });
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla2 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(pantalla2);
            }
        });
        btnSiguiente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla3 = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(pantalla3);
            }
        });

    }
}