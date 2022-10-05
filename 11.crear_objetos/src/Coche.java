// creación de la clase

public class Coche {

    // atributos que varían para cada objeto coche
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;
    int acelerar;

    // constructor: El constructor recibe una serie de parámetros (lo que está entre
    // paréntesis) que nos permitirán crear o instanciar el objeto coche.

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;

    }
    // La notación this. indica que el objeto que se crea a partir de la clase Coche
    // hace referencia a las propiedades definidas en la declaración de la clase.

    // comportamientos o métodos

    public void acelerar() {
        this.velocidad = velocidad;

    }
}
