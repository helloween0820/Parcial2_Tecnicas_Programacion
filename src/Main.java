import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el color de la direccion de envio: ");
        String direccionEnvio = sc.nextLine();

        System.out.println("Ingrese el nombre del producto");
        String nombrePro = sc.nextLine();

        System.out.println("Ingrese una descripcion del producto");
        String descripcion = sc.nextLine();

        System.out.println("Ingrese la cantidad del producto");
        int cantidad = sc.nextInt();

        System.out.println("Ingrese el precio del producto");
        int precio = sc.nextInt();


        System.out.println("Ingrese el tipo de producto que desea comprar\n 1. Telefono\n 2. Laptop\n 3. Accesorio");
        int opcion = sc.nextInt();

        switch(opcion) {
            case 1:
                System.out.println("Ingrese el modelo del telefono: ");
                String modelo = sc.nextLine();

                System.out.println("Ingrese la ram del telefono: ");
                int ram = sc.nextInt();

                System.out.println("Ingrese el procesador del telefono: ");
                String procesador = sc.nextLine();



                break;

            case 2:

                System.out.println("Ingrese el sistema operativo de la laptop: " );
                String sistemaOperativo = sc.nextLine();
                System.out.println("Ingrese las pulgadas de la laptop: " );
                int pulgadas = sc.nextInt();

                break;

            case 3:

                System.out.println("Ingrese el tipo de accesorio " );
                String tipoAccesorio = sc.nextLine();
                System.out.println("Ingrese el color del accesorio  " );
                String color = sc.nextLine();
                System.out.println("Ingrese el tamaño del accesorio " );
                String tamano = sc.nextLine();
                break;

            default:
                System.out.println("elija una opción valida");
        }

    }
}