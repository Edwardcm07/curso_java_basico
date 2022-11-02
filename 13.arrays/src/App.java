public class App {
    public static void main(String[] args) {
        String nombre1 = "Alejandro";
        String nombre2 = "Eduar";
        String nombre3 = "Daniela";

        String[] nombres = new String[3];
        int[] numeros = new int[5];
        String[] nombres2 = new String[] { nombre1, nombre2, nombre3 };

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        System.out.println(nombres2[0]);

    }
}
