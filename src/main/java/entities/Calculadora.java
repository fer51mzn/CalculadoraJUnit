package entities;

public class Calculadora {

    public int suma(int a, int b){
        return a+b;
    }

    public int resta(int a, int b){
        return a-b;
    }

    public int multiplicar(int a, int b){
        return a*b;
    }

    public int dividir(int a, int b){
        return a/b;
    }

    public int complejidadCiclomatica(int a, int n, int p){
        return a-n+2*p;
    }


}
