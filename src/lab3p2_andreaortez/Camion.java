
package lab3p2_andreaortez;

public class Camion extends Vehiculo{
    private int carga, altura;
    private boolean excavadora;

    public Camion() {
    }

    public Camion(int carga, int altura, boolean excavadora, String color, String marca, String modelo, int año, int cantidad, double precio) {
        super(color, marca, modelo, año, cantidad, precio);
        this.carga = carga;
        this.altura = altura;
        this.excavadora = excavadora;
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

    public boolean isExcavadora() {
        return excavadora;
    }

    public void setExcavadora(boolean excavadora) {
        this.excavadora = excavadora;
    }

    @Override
    public String toString() {
        return super.toString() + "Camion{" + "carga=" + carga + ", altura=" + altura + ", excavadora=" + excavadora + '}';
    }
    
    
}
