class Celular extends ProductoElectronico {
    private String marca;

    public Celular(String nombre, double precio, int garantia, String marca) {
        super(nombre, precio, garantia);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public void cargar(int cargaInicial) {
        System.out.println("Cargando el celular " + getNombre() + " de la marca " + marca);


        int tiempoCarga = calcularTiempoCarga(cargaInicial);

        System.out.println("El tiempo de carga estimado es de " + tiempoCarga + " minutos.");
    }

    private int calcularTiempoCarga(int cargaInicial) {

        int tiempoCarga = 100 - cargaInicial;
        return tiempoCarga;
    }
}
