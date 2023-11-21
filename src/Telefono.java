 class Telefono extends Producto{

    private String modelo;
    private int ram;
    private String procesador;

    private int cantidad;

    private String nombre;

    private String descripcion;

    private int precio;

     /**
      Constructor de la clase Telefono
      *
      * @param modelo
      * @param ram
      * @param procesador
      *
      * Complejidad Temporal: O(1) Tiempo constante
      *
      */
     public Telefono(String nombre, String descripcion, int cantidad, int precio, String modelo, int ram, String procesador) {
         super(nombre, descripcion, cantidad, precio);
         this.modelo = (modelo);
         this.ram = ram;
         this.procesador = procesador;
     }
     public String getNombre() {
         return this.nombre;
     }
     public String getModelo() {
         return modelo;
     }

     public void setModelo(String modelo) {
         this.modelo = modelo;
     }

     public int getRam() {
         return ram;
     }

     public void setRam(int ram) {
         this.ram = ram;
     }

     public String getProcesador() {
         return procesador;
     }

     public void setProcesador(String procesador) {
         this.procesador = procesador;
     }
 }
