
package lab3p2_andreaortez;

import java.util.ArrayList;

public class Concesionaria {
    private int ID, saldo;
    private String nombre;
    private ArrayList <Vehiculo> vehiculos = new ArrayList();
    private ArrayList <Cliente> clientes = new ArrayList();

    public Concesionaria() {
    }

    public Concesionaria(int ID, int saldo, String nombre) {
        this.ID = ID;
        this.saldo = saldo;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "ID=" + ID + ", saldo=" + saldo + ", nombre=" + nombre + ", vehiculos=" + vehiculos + ", clientes=" + clientes + '}';
    }
    
}
