import entities.Calculadora;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void suma(){
        Calculadora c = new Calculadora();
        int resultado = c.suma(1,2);
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado,resultado);
    }

    @Test
    public void resta(){
        Calculadora c = new Calculadora();
        int resultado = c.resta(2,1);
        int resultadoEsperado = 1;
        assertEquals(resultadoEsperado,resultado);
    }

    @Test
    public void multiplicar(){
        Calculadora c = new Calculadora();
        int resultado = c.multiplicar(2,1);
        int resultadoEsperado = 2;
        assertEquals(resultadoEsperado,resultado);
    }

    @Test
    public void dividir(){
        Calculadora c = new Calculadora();
        int resultado = c.dividir(2,1);
        int resultadoEsperado = 2;
        assertEquals(resultadoEsperado,resultado);
    }

    @Test
    public void complejidadCiclomatica(){
        Calculadora c = new Calculadora();
        int resultado = c.complejidadCiclomatica(2,1, 3);
        int resultadoEsperado = 7;
        assertEquals(resultadoEsperado,resultado);
    }
}
