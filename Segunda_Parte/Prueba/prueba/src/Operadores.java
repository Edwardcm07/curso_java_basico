public class Operadores {
    public static void main(String[] args) {
        // aritmeticos:

        int num1 = 10;
        int num2 = 20;
        int resultadoSuma = num1 + num2;

        System.out.println(resultadoSuma);
        System.out.println(resultadoSuma + 5.77);

        int resultadoResta = num2 - num1;
        System.out.println(resultadoResta);

        /*
         * Comparación:
         * > mayor que
         * < menor que
         * >= mayor o igual que
         * <= menor o igual que
         * == igual que
         */
        boolean resultado1 = num1 > num2;
        System.out.println(resultado1);
        boolean resultado2 = num1 < num2;
        System.out.println(resultado2);

        /*
         * operadores lógicos
         * and &&
         * or ||
         */

        boolean resultado3 = num1 > 5 && num1 < 30;

        int edad = 17;
        boolean carnetJoven = edad > 15 && edad <= 26;
        System.out.println(resultado3);
        System.out.println(carnetJoven);
    }
}
