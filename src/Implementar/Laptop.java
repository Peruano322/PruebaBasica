package Implementar;
public class Laptop extends Dispositivo{
    private int memoria_ram;
    private int almacenamiento;

    public Laptop() {
    }

    public Laptop(int memoria_ram, int almacenamiento, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.memoria_ram = memoria_ram;
        this.almacenamiento = almacenamiento;
    }

    public int getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(int memoria_ram) {
        this.memoria_ram = memoria_ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Laptop{" + "memoria_ram=" + memoria_ram + ", almacenamiento=" + almacenamiento + '}';
    }
    
    
    
}
