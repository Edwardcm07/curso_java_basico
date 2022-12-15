public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    public String dime_datos_generales() {// getter
        return "la paltaforma del vehiculo tiene " + ruedas + " ruedas" + ", mide " + largo / 1000
                + " metros con un ancho " + ancho + " cm y un peso de la plataforma de " + peso_plataforma + " kg.";
    }

    public void establece_color(String color_coche) {// setter
        color = color_coche;
    }

    public String dime_color() {
        return "el color del coche es " + color;
    }

    public void configura_asientos(String asientos_cuero) {// getter
        if (asientos_cuero.equalsIgnoreCase("si")) {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }

    public String dime_asientos() {
        if (asientos_cuero == true) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche tiene asientos de serie";
        }
    }

    public String dime_peso_coche() {// getter+setter
        int peso_carroceria = 500;
        peso_total = peso_plataforma + peso_carroceria;
        if (asientos_cuero == true) {
            peso_total = peso_total + 50;
        }
        if (climatizador == true) {
            peso_total = peso_total + 20;
        }
        return "El peso del coche es " + peso_total;
    }
}
