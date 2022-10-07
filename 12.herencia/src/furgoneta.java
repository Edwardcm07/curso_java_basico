public class furgoneta extends Coche {
    private int capacidad_carga;
    private int plazas_extra;

    public furgoneta(int plazas_extra, int capacidad_carga) {
        super(); // llama al constructor de la clase padre
        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;
    }
}
