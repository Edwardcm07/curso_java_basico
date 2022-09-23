public class App {
    public static void main(String[] args) {
        boolean check = 5 < 10;

        int num1 = 50;
        int num2 = 10;
        int num3 = 20;
        int num4 = 1000;

        if (num1 < num2 && num2 < num3) {
            System.out.println("verdadero");
            System.out.println("verdadero");
        } else if (num3 < num4) {
            System.out.println("else if");
        } else {

        }
        System.out.println("Fin");
    }
}
