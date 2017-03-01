/**
 * Created by Carlos on 01/03/2017.
 */
public class Controller {

    public int suma(Calculadora c){
        return c.getValorA()+c.getValorB();
    }
    public int resta(Calculadora c){
        return c.getValorA()-c.getValorB();
    }
    public int multiplicacion(Calculadora c){
        return c.getValorA()*c.getValorB();
    }
    public int division(Calculadora c){
        return c.getValorA()/c.getValorB();
    }
}



