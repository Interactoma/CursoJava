import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);
        String numeroBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(numeroBinario);
        String numeroHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(numeroHexadecimal);
        String numeroOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(numeroOctal);
        //int numeroBinario = 0b111110100;poner 0b al inicio le indica al sistema que es binario
        //System.out.println("numeroBinario = " + numeroBinario);
        //int numeroOctal = 0764; //anteponer 0 para indicar que es un octal
        //int numeroHexadecimal = 0x1f4; //anteponer 0x para indicar que es un hexadecimal
        String mensaje = numeroBinario;
        mensaje += "\n" + numeroHexadecimal;
        mensaje += "\n" + numeroOctal;
        JOptionPane.showMessageDialog(null, mensaje);


    }
}
