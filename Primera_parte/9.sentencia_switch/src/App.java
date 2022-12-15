import java.security.Principal;

public class App {
    public static void main(String[] args) {
        String weather = "sunny";

        switch (weather) {
            case "sunny":
                System.out.println("El dia está soleado");
                break;// es necesario que este el break o si no el programa no funciona correctamente
            case "cloudy":
                System.out.println("El dia está nublado");
                break;
            // se debe hacer un default por buenas practicas
            default:
                System.out.println("nose ha podido identificar el clima");
                break;

        }

    }
}
