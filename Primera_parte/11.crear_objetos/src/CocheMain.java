
//la clase Main es el punto de partida para nuestro programa que creará un objeto coche

public class CocheMain {

    public static void main(String[] args) {
        // creación del objeto cocherojo
        Coche cocherojo = new Coche("rojo", "honda", "civic", 1430.45, 5.4);

        // utilización del método creado en la clase Coche, al cual le actualizamos un
        // nuevo valor
        cocherojo.acelerar = 50;

    }
}
