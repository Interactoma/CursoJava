public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola mundo desde Java";
        System.out.println(saludar.toUpperCase());
        System.out.println("saludar = " + saludar);

        int numero = 10;
        var numero2 = 2.5;
        var falso = "es falso";
        boolean valor = false;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 5.0;
        } else  {
            System.out.println(falso.toUpperCase());
        }
        System.out.println("numero2 = " + numero2);
    }
}
