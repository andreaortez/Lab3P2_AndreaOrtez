
package lab3p2_andreaortez;

import java.awt.Color;

public class Bicicleta extends Vehiculo{
    private String descripcion;
    private int radio;
    private String tipo;

    public Bicicleta() {
    }

    public Bicicleta(String descripcion, int radio, String tipo, Color color, String marca, String modelo, int año, int cantidad, double precio) {
        super(color, marca, modelo, año, cantidad, precio);
        this.descripcion = descripcion;
        this.radio = radio;
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "descripcion=" + descripcion + ", radio=" + radio + ", tipo=" + tipo + '}';
    }
    
    
}
