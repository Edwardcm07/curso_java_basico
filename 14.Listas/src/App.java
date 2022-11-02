import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Carlos");
        nombres.add("Fabian");
        nombres.add("Pedro");
        nombres.add("Ximena");
        nombres.add("Valeria");

        System.out.println(nombres);

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        List<Coche> coches = new ArrayList<>();
        nombres.add(new Coche("honda Civic"));
        nombres.add(new Coche("Alfa Romeo"));
        nombres.add(new Coche("Renault 4"));

    }
}
