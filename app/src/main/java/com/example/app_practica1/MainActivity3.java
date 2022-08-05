package com.example.app_practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private Button btnVolver, b1, b2, b3, b4, b5;
    private EditText numero1, numero2;
    private TextView resu;
    View focusView = null;
    String Cadena = "Tec. Francisco Jonatan Abarca Roque";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnVolver = findViewById(R.id.btnVolver);
        Toast mensaje = Toast.makeText(this, "Bienvenidos, " + Cadena, Toast.LENGTH_LONG);
        mensaje.show();
        numero1 = findViewById(R.id.edt1);
        numero2 = findViewById(R.id.edt2);
        focusView = numero1;
        focusView.requestFocus();

        b1 = findViewById(R.id.btnSumar);
        b2 = findViewById(R.id.btnRestar);
        b3 = findViewById(R.id.btnMulti);
        b4 = findViewById(R.id.btnDividir);
        b5 = findViewById(R.id.btnAcercaDe);

        resu = findViewById(R.id.textRes);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(MainActivity3.this, MainActivity.class);
                finish();
                startActivity(volver);
            }
        });
    }

    public void OnClick(View v)
    {
        String valor1 = "";
        String valor2 = "";
        String mensaje1 = "";
        String res = "";
        float a, b, c;

        switch (v.getId()){
            case R.id.btnSumar:
                valor1 = numero1.getText().toString();
                valor2 = numero2.getText().toString();
                if((valor1 != "") && (!valor2.isEmpty())){
                    a = Float.parseFloat(valor1);
                    b = Float.parseFloat(valor2);
                    c = a + b;
                    res = String.valueOf(c);
                    mensaje1 = "La suma de " + a + " + " + b + " es: " + c;
                }else{
                    focusView = numero1;
                    focusView.requestFocus();
                    res = "0.0";
                    mensaje1 = "Debe completar el formulario";
                }
                break;
            case R.id.btnRestar:
                valor1 = numero1.getText().toString();
                valor2 = numero2.getText().toString();
                if((valor1 != "") && (!valor2.isEmpty())){
                    a = Float.parseFloat(valor1);
                    b = Float.parseFloat(valor2);
                    c = a - b;
                    res = String.valueOf(c);
                    mensaje1 = "La resta de " + a + " - " + b + " es: " + c;
                }else{
                    focusView = numero1;
                    focusView.requestFocus();
                    res = "0.0";
                    mensaje1 = "Debe completar el formulario";
                }
                break;
            case R.id.btnMulti:
                valor1 = numero1.getText().toString();
                valor2 = numero2.getText().toString();
                if((valor1 != "") && (!valor2.isEmpty())){
                    a = Float.parseFloat(valor1);
                    b = Float.parseFloat(valor2);
                    c = a * b;
                    res = String.valueOf(c);
                    mensaje1 = "La multiplicación de " + a + " * " + b + " es: " + c;
                }else{
                    focusView = numero1;
                    focusView.requestFocus();
                    res = "0.0";
                    mensaje1 = "Debe completar el formulario";
                }
                break;
            case R.id.btnDividir:
                valor1 = numero1.getText().toString();
                valor2 = numero2.getText().toString();
                if((valor1 != "") && (!valor2.isEmpty())){
                    a = Float.parseFloat(valor1);
                    b = Float.parseFloat(valor2);
                    c = a / b;
                    res = String.valueOf(c);
                    mensaje1 = "La resta de " + a + " / " + b + " es: " + c;
                }else{
                    focusView = numero1;
                    focusView.requestFocus();
                    res = "0.0";
                    mensaje1 = "Debe completar el formulario";
                }
                break;
            case R.id.btnAcercaDe:
                mensaje1 = "Creado por: Francisco Jonatan Abarca Roque";
                break;
            default:
                break;
        }
        resu.setText(res);
        Toast Mensaje = Toast.makeText(this, mensaje1, Toast.LENGTH_LONG);
        Mensaje.show();
    }
}