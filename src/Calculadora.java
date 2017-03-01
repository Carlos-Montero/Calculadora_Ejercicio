/**
 * Created by Carlos on 01/03/2017.
 */
public class Calculadora {
     private int valorA;
    private int valorB;

    public Calculadora(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public void setValorA (int valorA){
        this.valorA=valorA;
    }

    public int getValorA(){
        return valorA;
    }
    public void setValorB (int valorA){
        this.valorB=valorB;
    }

    public int getValorB(){
        return valorB;
    }


    public int suma(){
        return this.valorA+this.valorB;
    }

    public int resta(){
        return this.valorA-this.valorB;
    }

    public int multiplicacion(){
        return this.valorA*this.valorB;
    }

    public int division(){
        return this.valorA/this.valorB;
    }
}
