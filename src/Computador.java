class Computadora extends ProductoElectronico {
    private String modelo;

    public Computadora(String nombre, double precio, int garantia, String modelo) {
        super(nombre, precio, garantia);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void cargar(int cargaInicial) {
        System.out.println("Cargando la computadora " + getNombre() + " del modelo " + modelo);

        int tiempoCarga = calcularTiempoCarga(cargaInicial);

        System.out.println("El tiempo de carga estimado es de " + tiempoCarga + " minutos.");
    }

    private int calcularTiempoCarga(int cargaInicial) {

        int tiempoCarga = 2 * (100 - cargaInicial);
        return tiempoCarga;
    }
}
