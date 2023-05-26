import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList de tipo ProductoElectronico
        ArrayList<ProductoElectronico> productos = new ArrayList<>();

        // Agregar objetos de cada clase hija al ArrayList
        productos.add(new Celular("iPhone", 999.99, 12, "Apple"));
        productos.add(new Celular("Galaxy", 899.99, 12, "Samsung"));
        productos.add(new Computadora("Laptop", 1499.99, 24, "Dell"));
        productos.add(new Computadora("PC de escritorio", 1999.99, 24, "HP"));

        // Recorrer la lista y mostrar el comportamiento de cada instancia
        for (ProductoElectronico producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Garantía: " + producto.getGarantia());
            producto.cargar(50);
            System.out.println("--------------------------------------------");
        }
    }
}
