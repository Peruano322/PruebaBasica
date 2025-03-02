package Implementar;

public class Dispositivo {
    protected String marca;
    protected String modelo;
    protected double precio;
    public Dispositivo() {
    }

    public Dispositivo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }    
}
