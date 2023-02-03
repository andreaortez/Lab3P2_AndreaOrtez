package lab3p2_andreaortez;

public class Vehiculo {

    protected String color, marca, modelo;
    protected int año, cantidad;
    protected double precio;

    public Vehiculo() {
    }

    public Vehiculo(String color, String marca, String modelo, int año, int cantidad, double precio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }

}
