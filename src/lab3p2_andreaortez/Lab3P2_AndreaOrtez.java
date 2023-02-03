package lab3p2_andreaortez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_AndreaOrtez {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Concesionaria> concesionaria = new ArrayList();
    static ArrayList<Cliente> clientes = new ArrayList();
    static ArrayList<Vehiculo> vehiculos = new ArrayList();

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.print("-- MENU --\n" + "1-> CRUD Concesionaria\n" + "2-> CRUD Clientes\n" + "3->CRUD Vehículos\n"
                    + "4->Compra/Venta de vehículos por parte de un cliente\n" + "5-> Salir\n" + "Ingrese su opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1 && concesionaria.size() >= 0) {
                System.out.print("\n1-> Crear\n" + "2-> Modificar\n" + "3-> Borrar\n" + "Ingrese su opcion: ");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        concesionaria.add(newC());
                        System.out.println("¡CONCESIONARIA CREADA CON ÉXITO!\n");
                        break;
                    case 2:
                        System.out.print("Ingrese posición a modificar: ");
                        int p = sc.nextInt();

                        if (p >= 0 && p < concesionaria.size()) {
                            System.out.print("Ingrese nueva direccion: ");
                            sc = new Scanner(System.in);
                            String direccion = sc.nextLine();
                            concesionaria.get(p).setDireccion(direccion);
                        } else {
                            System.out.println("La posición dada no es válida\n");
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese posición a modificar: ");
                        p = sc.nextInt();

                        if (p >= 0 && p < concesionaria.size()) {
                            concesionaria.remove(p);
                        } else {
                            System.out.println("La posición dada no es válida\n");
                        }
                }
            } else {
                switch (opcion) {
                    case 2:
                        System.out.print("\n1-> Crear\n" + "2-> Listar\n" + "3-> Borrar\n" + "Ingrese su opcion: ");
                        int op = sc.nextInt();

                        switch (op) {
                            case 1://Agregar
                                clientes.add(newCl());
                                System.out.println("¡CLIENTE CREADO CON ÉXITO!\n");
                                break;
                            case 2://Listar
                                String s = "";

                                if (op >= 0 && op < clientes.size()) {
                                    for (Cliente t : clientes) {
                                        s += "\n" + clientes.indexOf(t) + " - " + t + "\n";
                                        System.out.println(s);
                                    }
                                }else {
                                    System.out.println("La posición dada no es válida\n");
                                }
                            case 3://Borrar
                                System.out.print("Ingrese posición a modificar: ");
                                int p = sc.nextInt();

                                if (p >= 0 && p < clientes.size()) {
                                    clientes.remove(p);
                                } else {
                                    System.out.println("La posición dada no es válida\n");
                                }
                        }

                        break;
                    case 3:
                }

            }

        } while (opcion != 5);
    }

    static Concesionaria newC() {
        System.out.println("Saldo: ");
        int saldo = sc.nextInt();
        System.out.print("Nombre: ");
        sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Direccion: ");
        sc = new Scanner(System.in);
        String direccion = sc.nextLine();
        Concesionaria C = new Concesionaria(concesionaria.size() + 1, saldo, name, direccion);
        return C;
    }

    static Cliente newCl() {
        System.out.println("Saldo: ");
        int saldo = sc.nextInt();
        System.out.print("Nombre: ");
        sc = new Scanner(System.in);
        String name = sc.nextLine();
        Cliente cl = new Cliente(clientes.size() + 1, saldo, name);
        return cl;
    }

    static Vehiculo newV() {

    }
}
