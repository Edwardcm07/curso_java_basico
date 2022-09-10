public class App {
    public static void main(String[] args) {

        // formas de definir funciones o sintaxis:

        // función tipo 1. No defino la función y solo se ejecuta
        /*
         * solo se pone la funcion en el main, y luego en la funcion decido que quiere
         * hacer
         */
        hola();

        // función tipo 2. Defino la función
        /*
         * defino la funcion o le doy un parametro en el main, y en la funcion se
         * ejecuta lo que quiero hacer
         */
        holaMundo2("Alejo");
        holaMundo2("Cano");// reutilizo la función

        // función tipo 3. Defino y retorno
        /*
         * defino la funcion en el main, le doy parametros y le digo lo que quiero que
         * haga todo en el main y en la funcion solo le digo que me retorne lo que
         * quiero que se imprima
         */
        String hola = holaMundo3();
        System.out.println(hola);
    }

    // funcion tipo 1
    private static void hola() {
        System.out.println("Hola Alejo ¿Comó estás?");
    }

    // funcion tipo 2
    private static void holaMundo2(String nombre) {
        System.out.println("Hola " + nombre);
    }

    // funcion tipo 3
    private static String holaMundo3() {
        return "Hola ¿Cómo estás?";

    }

}
