public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040'; //permite un solo caracter unicode
        char decimal = 64; //decimal
        char simbolo = '@'; //simbolo
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = caracter: " + (decimal == caracter));
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = '\u0020'; //espacio
        char retroceso = '\b'; //retrocede un espacio y elimina el caracter en esa posicion
        char tabulador = '\t';//tabulacion
        char nuevaLinea = '\n';//salto de linea
        char retornoCarro = '\r';//limpia la linea antes de el

        System.out.println("char corresponde en byte:" + retroceso + Character.BYTES);
        System.out.println("char corresponde en bites = " + tabulador + Character.SIZE);
        System.out.println("maximo valor para char = " + Character.MAX_VALUE);
        System.out.println("minimo valor para char = " + Character.MIN_VALUE);




    }
}
