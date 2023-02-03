
package lab3p2_andreaortez;

public class Carro extends Vehiculo{
    private int puertas, velocidad;
    private String descripcion;

    public Carro() {
    }

    public Carro(int puertas, int velocidad, String descripcion, String color, String marca, String modelo, int año, int cantidad, double precio) {
        super(color, marca, modelo, año, cantidad, precio);
        this.puertas = puertas;
        this.velocidad = velocidad;
        this.descripcion = descripcion;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return super.toString() + "Carro{" + "puertas=" + puertas + ", velocidad=" + velocidad + ", descripcion=" + descripcion + '}';
    }
    
    
}
