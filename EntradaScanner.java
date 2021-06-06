import java.util.Scanner;
import java.util.InputMismatchException;
public class EntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
       // String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);
        String numeroBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String numeroHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        String numeroOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String mensaje = numeroBinario;
        mensaje += "\n" + numeroHexadecimal;
        mensaje += "\n" + numeroOctal;
        System.out.println(mensaje);
        


    }
}
