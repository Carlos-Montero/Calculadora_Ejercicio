/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Carlos on 01/03/2017.
 */
/*public class Main {

    public static void main(String[] args) throws IOException {
        Controller control = new Controller();
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int indice = 75;
        while (indice != 0) {

            System.out.println("\n Select option");
            System.out.println("*********************");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicacion");
            System.out.println("4: Division");
            System.out.println("0: Salir");

            int option = Integer.parseInt(buff.readLine());
            switch (option) {
                case 1: //Suma
                    System.out.println("Introduce valor");
                    int valorA = Integer.parseInt(buff.readLine());
                    System.out.println ("Introduce otro valor");
                    int valorB = Integer.parseInt(buff.readLine());
                    Calculadora c = new Calculadora(valorA,valorB);
                    System.out.println("El resultado es " + control.suma(c));
                    break;
                case 2: //Resta
                    System.out.println("Introduce valor");
                    int valor1 = Integer.parseInt(buff.readLine());
                    System.out.println ("Introduce otro valor");
                    int valor2 = Integer.parseInt(buff.readLine());
                    Calculadora ca = new Calculadora(valor1,valor2);
                    System.out.println("El resultado es " + control.resta(ca));
                    break;
                case 3:  //Multiplicación
                    System.out.println("Introduce valor");
                    int valorP = Integer.parseInt(buff.readLine());
                    System.out.println ("Introduce otro valor");
                    int valorS = Integer.parseInt(buff.readLine());
                    Calculadora cal = new Calculadora(valorP,valorS);
                    System.out.println("El resultado es " + control.multiplicacion(cal));
                    break;
                case 4: //Division
                    System.out.println("Introduce valor");
                    int valorY = Integer.parseInt(buff.readLine());
                    System.out.println ("Introduce otro valor");
                    int valorZ = Integer.parseInt(buff.readLine());
                    Calculadora calc = new Calculadora(valorY,valorZ);
                    System.out.println("El resultado es " + control.division(calc));
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    System.exit(0);

                    break;

            }
        }

    }
}
*/