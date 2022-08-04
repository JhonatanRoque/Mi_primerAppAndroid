package com.example.app_practica1;

public class Operaciones {
    double dato1;
    double dato2;

    public Operaciones(){

    }

    public double getDato1() {
        return dato1;
    }

    public void setDato1(double dato1) {
        this.dato1 = dato1;
    }

    public double getDato2() {
        return dato2;
    }

    public void setDato2(double dato2) {
        this.dato2 = dato2;
    }

    public Operaciones(double dat1, double dat2){
        this.setDato1(dat1);
        this.setDato2(dat2);
    }
    public double sumar(){
        double resultado = 0;
        resultado = this.getDato1() + this.getDato2();
        return resultado;
    }
    public double restar(){
        double resultado = 0;
        resultado = this.getDato1() - this.getDato2();
        return resultado;
    }
    public double multiplicar(){
        double resultado = 0;
        resultado = this.getDato1() * this.getDato2();
        return resultado;
    }
    public double dividir(){
        double resultado = 0;
        resultado = this.getDato1() / this.getDato2();
        return resultado;
    }
}
