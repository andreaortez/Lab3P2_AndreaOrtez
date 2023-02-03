
package lab3p2_andreaortez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_AndreaOrtez {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        ArrayList <Cliente> clientes= new ArrayList();
        ArrayList<Concesionaria> concesionaria = new ArrayList();
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        do {
            System.out.print("-- MENU --\n" + "1-> CRUD Concesionaria\n" + "2-> CRUD Clientes\n" + "3->CRUD Vehículos\n" 
                    + "4->Compra/Venta de vehículos por parte de un cliente\n" +"5-> Salir\n" + "Ingrese su opcion: ");
            opcion = sc.nextInt();
        }while(opcion!=5);
    }
    
}
