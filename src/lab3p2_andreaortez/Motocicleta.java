package lab3p2_andreaortez;

import java.awt.Color;

public class Motocicleta extends Vehiculo{

    private String desplazamiento;
    private boolean electrica;

    public Motocicleta() {
    }

    public Motocicleta(String desplazamiento, boolean electrica, Color color, String marca, String modelo, int año, int cantidad, double precio) {
        super(color, marca, modelo, año, cantidad, precio);
        this.desplazamiento = desplazamiento;
        this.electrica = electrica;
    }
    
    public String getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return super.toString() + "Motocicleta{" + "desplazamiento=" + desplazamiento + ", electrica=" + electrica + '}';
    }
    
}
