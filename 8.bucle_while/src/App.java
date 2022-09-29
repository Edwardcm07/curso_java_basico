public class App {
    public static void main(String[] args) {

        int count = 0;

        while (count < 10) {

            /*
             * CICLO WHILE
             * System.out.println("Hola como estan " + count);
             * count++;// condicion
             * }
             */

            // PALABRAS RESERVADAS continue y break
            count++;
            if (count == 6)
                break;// rompe el flujo de ejecucion y rompe el bucle
            // continue;//salta el valor ó y continua a la siguiente iteración

            System.out.println("Hola como estan " + count);
        }
        System.out.println("FIN del bucle");
    }
}
