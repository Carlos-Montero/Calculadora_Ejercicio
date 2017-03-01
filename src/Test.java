import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by Carlos on 01/03/2017.
 */
public class Test{
    @org.junit.Test
    public void sumaTest(){
        Calculadora c = new Calculadora(2,3);
        assertEquals(5,c.suma());
    }

    @org.junit.Test
    public void restaTest(){
        Calculadora c = new Calculadora(3,2);
        assertEquals(1,c.resta());
    }

    @org.junit.Test
    public void multiplicacionTest(){
        Calculadora c = new Calculadora(2,3);
        assertEquals(6,c.multiplicacion());
    }

    @org.junit.Test
    public void divisionTest() {
        Calculadora c = new Calculadora(6, 2);
        assertEquals(3, c.division());
    }

    @org.junit.Test//(expected = java.lang.ArithmeticException.class)
    public void divisionEntreCeroTest()throws Exception{
        Calculadora c = new Calculadora(6,0);
        assertEquals(0,c.division());
    }





}
