package lab3p2_andreaortez;

public class Motocicleta extends Vehiculo {

    private String desplazamiento;
    private boolean x;
    private String electrica;

    public Motocicleta() {
    }

    public Motocicleta(String desplazamiento, boolean x, String color, String marca, String modelo, int año, int cantidad, double precio) {
        super(color, marca, modelo, año, cantidad, precio);
        this.desplazamiento = desplazamiento;
        if (x == true) {
            electrica = "Tiene retroexcavadora";
        } else {
            electrica = "No tiene retroexcavadora";
        }
    }

    public String getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    @Override
    public String toString() {
        return super.toString() + "Motocicleta{" + "desplazamiento=" + desplazamiento + ", electrica=" + electrica + '}';
    }

}
