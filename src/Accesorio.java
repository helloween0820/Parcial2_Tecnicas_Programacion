 class Accesorio  extends Producto{

     private String tipoAccesorio;
     private String color;

     private String tamano; /** pequeño, mediano, grande */


     /**
      Constructor de la clase Accesorio
      *
      * @param color
      * @param tipoAccesorio
      * @param tamano
      *
      * Complejidad Temporal: O(1) Tiempo constante
      *
      */

     public Accesorio(String nombre, String descripcion, int cantidad, int precio, String tipoAccesorio, String color, String tamano) {
         super(nombre, descripcion, cantidad, precio);
         this.color = color;
     }

     public String getTipoAccesorio() {
         return tipoAccesorio;
     }

     public void setTipoAccesorio(String tipoAccesorio) {
         this.tipoAccesorio = tipoAccesorio;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public String getTamano() {
         return tamano;
     }

     public void setTamano(String tamano) {
         this.tamano = tamano;
     }
 }
