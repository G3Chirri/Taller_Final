import java.util.ArrayList;

abstract class ProductoElectronico {
    private String nombre;
    private double precio;
    private int garantia;

    public ProductoElectronico(String nombre, double precio, int garantia) {
        this.nombre = nombre;
        this.precio = precio;
        this.garantia = garantia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getGarantia() {
        return garantia;
    }

    public abstract void cargar(int cargaInicial);
}
