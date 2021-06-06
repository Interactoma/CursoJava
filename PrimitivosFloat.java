public class PrimitivosFloat {
    //static float varFlotante = 45.45f;
    public static void main(String[] args) {

        float realFloat = 2.12e3f; //se debe poner f para indicar que es un float y no un doUble.
        System.out.println("realFloat = " + realFloat);

        System.out.println("float corresponde en byte = " + Float.BYTES);
        System.out.println("float corresponde en bites = " + Float.SIZE);
        System.out.println("Maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Minimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38; //no es necesario indicar que es un double con la letra d.
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte = " + Double.BYTES);
        System.out.println("double corresponde en bites = " + Double.SIZE);
        System.out.println("Maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("Minimo valor para double = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
