package lab3p2_andreaortez;

public class Camion extends Vehiculo {

    private int volumen, carga, altura;
    private boolean x;
    private String excavadora;

    public Camion() {
    }

    public Camion(int volumen, int carga, int altura, boolean x, String color, String marca, String modelo, int año, int cantidad, double precio) {
        super(color, marca, modelo, año, cantidad, precio);
        this.volumen = volumen;
        this.carga = carga;
        this.altura = altura;
        if (x == true) {
            excavadora = "Tiene retroexcavadora";
        } else {
            excavadora = "No tiene retroexcavadora";
        }
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isX() {
        return x;
    }

    public void setX(boolean x) {
        this.x = x;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return super.toString() + "Camion{" + "volumen=" + volumen + ", carga=" + carga + ", altura=" + altura + ", excavadora=" + excavadora + '}';
    }
}
