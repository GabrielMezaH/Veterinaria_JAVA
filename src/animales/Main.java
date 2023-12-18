
package animales;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Veterinaria veterinaria = new Veterinaria();
        
        while(true){
            System.out.println("Veterinaria Honor");
            System.out.println("Realizado por Gabriel Francisco Meza Hernandez");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Mostrar Cliente");
            System.out.println("3. Salir");
            System.out.println("Elija una opcion:");
            int opcion = entrada.nextInt();
            
            entrada.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del cliente: ");
                    String nombreCliente = entrada.nextLine();
                    System.out.println("Ingrese la direccion del cliente: ");
                    String direccionCliente = entrada.nextLine();
                    Cliente cliente = new Cliente(nombreCliente, direccionCliente);
                    
                    System.out.println("Cuantas mascotas tiene el cliente? ");
                    int numMascotas = entrada.nextInt();
                    entrada.nextLine();
                    
                    for (int i=0; i<numMascotas; i++){
                    System.out.println("Ingrese el nombre de la mascota" + (i+1) + " : ");
                    String nombreMascota = entrada.nextLine();
                    System.out.println("Ingrese el especie de la mascota" + (i+1) + " : ");
                    String especieMascota = entrada.nextLine();
                    System.out.println("Ingrese la edad de la mascota" + (i+1) + " : ");
                    int edadMascota = entrada.nextInt();
                    entrada.nextLine();
                    
                    Animal mascota = new Animal(nombreMascota,especieMascota,edadMascota);
                    cliente.agregarMascota(mascota);
                }
                    veterinaria.agregarCliente(cliente);
                    System.out.println("Cliente agregado con exito");
                    break;
                    
                case 2:
                    System.out.println("Los clientes en la veterinaria son :");
                    for (Cliente c: veterinaria.getClientes()){
                        System.out.println(c);
                    }
                    break;
                            
                case 3:
                    System.out.println("Hasta la vista baby!!");
                    System.exit(0);
                    
                default:
                    System.out.println("Opcion no valida, por favor ingrese una del menu");
            }
        }
    }
    
}
