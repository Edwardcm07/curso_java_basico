public class SobrecargaDeFunciones {
    public static void main(String[] args) {
        // la sobre carga permite duplicar una función desde que tenga diferente numero
        // o tipo de parametros

    }

    static double suma(double num1, double num2) {
        return num1 + num2;
    }

    static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

}
