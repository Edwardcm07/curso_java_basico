public class Coche {
    // atributos
    String color;
    String marca;
    int km;

    // constructores
    // aqui puedo inicializar la clase pero no es necesario
    // metodos
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.color = "Blanco";
        coche.marca = "Audi";
        coche.km = 0;

        System.out.println("El color del coche es: " + coche.color);
        System.out.println("La marca del coche es: " + coche.marca);
        System.out.println("El kilometraje del coche es: " + coche.km);

        Coche coche2 = new Coche();
        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 1000;

        System.out.println("\nEl color del coche es: " + coche2.color);
        System.out.println("La marca del coche es: " + coche2.marca);
        System.out.println("El kilometraje del coche es: " + coche2.km);
    }
}
