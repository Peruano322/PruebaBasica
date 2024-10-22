package Implementar;

public class Tableta extends Dispositivo{
    private double tamaño_pantalla;
    private boolean soporte_stylus;

    public Tableta() {
    }
    public Tableta(double tamaño_pantalla, boolean soporte_stylus, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.tamaño_pantalla = tamaño_pantalla;
        this.soporte_stylus = soporte_stylus;
    }

    public double getTamaño_pantalla() {
        return tamaño_pantalla;
    }

    public void setTamaño_pantalla(double tamaño_pantalla) {
        this.tamaño_pantalla = tamaño_pantalla;
    }

    public boolean isSoporte_stylus() {
        return soporte_stylus;
    }

    public void setSoporte_stylus(boolean soporte_stylus) {
        this.soporte_stylus = soporte_stylus;
    }

    @Override
    public String toString() {
        return "Tableta{" + "tama\u00f1o_pantalla=" + tamaño_pantalla + ", soporte_stylus=" + soporte_stylus + '}';
    }
    
    
    
}
