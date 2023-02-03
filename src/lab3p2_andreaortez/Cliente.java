package lab3p2_andreaortez;

import java.util.ArrayList;

public class Cliente {

    private int ID;
    private String nombre;
    private ArrayList<Vehiculo> vehiculos = new ArrayList();
    private double saldo;

    public Cliente() {
    }

    public Cliente(int ID, String nombre, double saldo) {
        this.ID = ID;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "ID=" + ID + ", nombre=" + nombre + ", vehiculos=" + vehiculos + ", saldo=" + saldo + '}';
    }
}
