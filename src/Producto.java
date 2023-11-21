public class Producto {

    private String nombre;
    private String descripcion;

    private int precio;

    private int cantidad;

    /**
     Constructor de la clase Producto
     *
     * @param nombre
     * @param descripcion
     * @param precio
     * @param cantidad
     *
     * Complejidad Temporal: O(1) Tiempo constante
     *
     */

    public Producto (String nombre, String descripcion, int cantidad, int precio ){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad ;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
