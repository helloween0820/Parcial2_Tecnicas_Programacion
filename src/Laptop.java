class Laptop extends Producto{

    private String sistemaOperativo;
    private int pulgadas;



    /**
     Constructor de la clase Laptop
     *
     * @param sistemaOperativo
     * @param pulgadas
     *
     * Complejidad Temporal: O(1) Tiempo constante
     *
     */
    public Laptop(String nombre, String descripcion, int cantidad, int precio, int pulgadas, String sistemaOperativo) {
        super(nombre, descripcion, cantidad, precio);
        this.pulgadas = pulgadas;
        this.sistemaOperativo = sistemaOperativo;
    }


    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
}
