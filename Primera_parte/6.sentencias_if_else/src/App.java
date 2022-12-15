public class App {
    public static void main(String[] args) {
        boolean check = 5 < 10;

        int num1 = 50;
        int num2 = 10;
        int num3 = 20;
        int num4 = 1000;

        if (num1 < num2 && num2 < num3) {// se evalua la primera opción
            System.out.println("verdadero");
            System.out.println("verdadero");
        } else if (num3 < num4) {// si no se cumple la primera opcion se evalua esta
            System.out.println("else if");
        } else {// si ninguna opción se cumple

        }
        // sale del else if
        System.out.println("Fin");
    }
}
