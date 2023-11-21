public class Cliente {

    private String nombre;
    private String direccionEnvio;

    private String listaPedidos;

    /**
     Constructor de la clase Accesorio
     *
     * @param nombre
     * @param direccionEnvio
     * @param listaPedidos
     *
     * Complejidad Temporal: O(1) Tiempo constante
     *
     */

    public Cliente (String nombre, String direccionEnvio, String listaPedidos) {

        this.nombre = nombre;
        this.direccionEnvio = direccionEnvio;
        this.listaPedidos = listaPedidos;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(String listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
}
