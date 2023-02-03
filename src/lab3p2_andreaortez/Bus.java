package lab3p2_andreaortez;

public class Bus extends Vehiculo{

    private int pasajeros;
    private String tipo;

    public Bus() {
    }

    public Bus(int pasajeros , String color, String marca, String modelo, int año, int cantidad, double precio) {
        super(color, marca, modelo, año, cantidad, precio);
        this.pasajeros = pasajeros;
        if (pasajeros > 50) {
            this.tipo = "De Ruta";
        } else {
            this.tipo = "Rapidito";
        }
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "Bus{" + "pasajeros=" + pasajeros + ", tipo=" + tipo + '}';
    }

}
