package Implementar;
public class Smartphone extends Dispositivo{
   private double tamaño_pantalla;
   private int capacidad_bateria;
   
    public Smartphone() {
    }
    
    public Smartphone(double tamaño_pantalla, int capacidad_bateria, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.tamaño_pantalla = tamaño_pantalla;
        this.capacidad_bateria = capacidad_bateria;
    }

    public double getTamaño_pantalla() {
        return tamaño_pantalla;
    }

    public void setTamaño_pantalla(double tamaño_pantalla) {
        this.tamaño_pantalla = tamaño_pantalla;
    }

    public int getCapacidad_bateria() {
        return capacidad_bateria;
    }

    public void setCapacidad_bateria(int capacidad_bateria) {
        this.capacidad_bateria = capacidad_bateria;
    }

    public String mostrarInfo() {
        return "\nSmartphone{" + "tama\u00f1o_pantalla=" + getTamaño_pantalla() + ", capacidad_bateria=" + getCapacidad_bateria() + '}';
    }

    
    
   
}
