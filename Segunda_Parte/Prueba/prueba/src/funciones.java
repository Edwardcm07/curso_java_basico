public class funciones {
    public static void main(String[] args) {

        // opcion 1: función sin parametros y sin tipo de retorno
        showMenu();

        // opcion 2: función sin parametros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);

        double price = getPrice();
        System.out.println(price);

        // opcion 3: función con parametros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootcamp");

        // opcion 4: función con parametros y con tipo de retornos
        String nombre = "Alan";
        String apellido = "Sastre";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int resultadoSuma = suma(50, 100);
        System.out.println(resultadoSuma);
    }

    private static int suma(int i, int j) {
        return i + j;
    }

    private static String obtenerSaludo(String nombre, String apellido) {
        return "Buenas tardes" + " " + nombre + " " + apellido;
    }

    static void imprimirSaludoBuenosDias(String name) {
        System.out.println("Buenos dias " + name);
    }

    private static double getPrice() {
        return 100.99;
    }

    /*
     * void indica que no devuelve nada
     */
    static void showMenu() {
        System.out.println("bienvenidos al E-commerce de Zapatillas");
        System.out.println("1- ver Zapatillas");
        System.out.println("2- comprar Zapatillas");
        System.out.println("3- Salir");

    }

    static String getMenu() {
        return "bienvenidos al E-commerce de Zapatillas: \n 1- ver Zapatillas... ";
    }
}
