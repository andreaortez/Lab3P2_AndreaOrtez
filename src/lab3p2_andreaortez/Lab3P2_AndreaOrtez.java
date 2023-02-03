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
                    case 2://Clientes
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
                                } else {
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
                    case 3://Vehiculo
                        System.out.print("\n1-> Crear\n" + "2-> Listar\n" + "3-> Modificar\n" + "4-> Borrar\n" + "Ingrese su opcion: ");
                        op = sc.nextInt();

                        switch (op) {
                            case 1://Agregar
                                Vehiculo v = newV();
                                vehiculos.add(v);
                                System.out.println("¡VEHICULO CREADO CON ÉXITO!\n");
                                ListarConcesionarios();
                                System.out.print("Ingrese posición de la concesionaria para agregar el carro: ");
                                int pos = sc.nextInt();
                                concesionaria.get(pos).getVehiculos().add(v);
                                break;
                            case 2://Listar
                                Listar();
                                break;
                            case 3: //Modificar
                                System.out.print("\n1-> Carro\n" + "2-> Camion de carga\n" + "3-> Bus\n" + "4-> Motocicleta\n" + "5-> Bicicleta\n"
                                        + "Ingrese su opcion: ");
                                int t = sc.nextInt();

                                Listar();

                                System.out.print("Ingrese posición a modificar: ");
                                int p = sc.nextInt();

                                if (p >= 0 && p < vehiculos.size()) {
                                    switch (t) {
                                        case 1://Carro
                                            if (vehiculos.get(p) instanceof Carro) {
                                                System.out.print("\n0-> Cantidad de puertas\n" + "1-> Velocidad Máxima" + "2-> Descripción de motor\n"
                                                        + "Ingrese el atributo a modificar: ");
                                                int ap = sc.nextInt();

                                                System.out.print("Ingrese el dato a modificar: ");

                                                switch (ap) {
                                                    case 0: {
                                                        int n = sc.nextInt();
                                                        ((Carro) vehiculos.get(p)).setPuertas(n);
                                                    }
                                                    case 1: {
                                                        int n = sc.nextInt();
                                                        ((Carro) vehiculos.get(p)).setVelocidad(n);
                                                    }
                                                    case 2: {
                                                        sc = new Scanner(System.in);
                                                        String n = sc.nextLine();
                                                        ((Carro) vehiculos.get(p)).setDescripcion(n);
                                                    }
                                                }
                                            }
                                        case 2://CAMION
                                            if (vehiculos.get(p) instanceof Camion) {
                                                System.out.print("\n0-> Volumen\n" + "1-> Máximo de carga," + "2-> Altura\n" + "3-> Retroexcavadora\n"
                                                        + "Ingrese el atributo a modificar: ");
                                                int ap = sc.nextInt();

                                                System.out.print("Ingrese el dato a modificar: ");

                                                switch (ap) {
                                                    case 0: {
                                                        int n = sc.nextInt();
                                                        ((Camion) vehiculos.get(p)).setVolumen(n);
                                                    }
                                                    case 1: {
                                                        int n = sc.nextInt();
                                                        ((Camion) vehiculos.get(p)).setCarga(n);
                                                    }
                                                    case 2: {
                                                        int n = sc.nextInt();
                                                        ((Camion) vehiculos.get(p)).setAltura(n);
                                                    }
                                                    case 3: {
                                                        boolean b = true;
                                                        System.out.print("¿El camión tiene retroexcavadora? [n/s]: ");
                                                        char resp = sc.next().charAt(0);
                                                        if (resp == 'n' || resp == 'N') {
                                                            b = false;
                                                        }
                                                        ((Camion) vehiculos.get(p)).setX(b);
                                                    }
                                                }
                                            }
                                        case 3://BUS
                                            if (vehiculos.get(p) instanceof Bus) {
                                                System.out.print("Ingrese la cantidad de pasajeros: ");

                                                int n = sc.nextInt();
                                                ((Bus) vehiculos.get(p)).setPasajeros(n);
                                            }
                                        case 4://MOTO
                                            if (vehiculos.get(p) instanceof Motocicleta) {
                                                System.out.print("\n0-> Desplazamiento del motor\n" + "1-> Eléctrica\n"
                                                        + "Ingrese el atributo a modificar: ");
                                                int ap = sc.nextInt();

                                                switch (ap) {
                                                    case 0: {
                                                        System.out.print("Ingrese el dato a modificar: ");
                                                        sc = new Scanner(System.in);
                                                        String n = sc.nextLine();
                                                        ((Motocicleta) vehiculos.get(p)).setDesplazamiento(n);
                                                    }
                                                    case 1: {
                                                        boolean b = true;
                                                        System.out.print("¿La motocicleta es eléctrica? [n/s]: ");
                                                        char resp = sc.next().charAt(0);
                                                        if (resp == 'n' || resp == 'N') {
                                                            b = false;
                                                        }
                                                        ((Motocicleta) vehiculos.get(p)).setX(b);
                                                    }
                                                }
                                            }
                                        case 5://BICI
                                            if (vehiculos.get(p) instanceof Bicicleta) {
                                                System.out.print("\n0-> Cantidad de puertas\n" + "1-> Velocidad Máxima" + "2-> Tipo\n"
                                                        + "Ingrese el atributo a modificar: ");
                                                int ap = sc.nextInt();

                                                System.out.print("Ingrese el dato a modificar: ");

                                                switch (ap) {
                                                    case 0: {
                                                        sc = new Scanner(System.in);
                                                        String n = sc.nextLine();
                                                        ((Bicicleta) vehiculos.get(p)).setDescripcion(n);
                                                    }
                                                    case 1: {
                                                        int n = sc.nextInt();
                                                        ((Bicicleta) vehiculos.get(p)).setRadio(n);
                                                    }
                                                    case 2: {
                                                        String tipo = "";
                                                        System.out.print("\n1-> BMX\n" + "2-> De calle\n" + "Ingrese su opcion: ");
                                                        int n = sc.nextInt();

                                                        if (n == 1) {
                                                            tipo = "BMX";
                                                        } else if (n == 2) {
                                                            tipo = "De calle";
                                                        }

                                                        ((Bicicleta) vehiculos.get(p)).setTipo(tipo);
                                                    }
                                                }
                                            }
                                    }
                                } else {
                                    System.out.println("La posición dada no es válida\n");
                                }
                                break;
                            case 4://Borrar
                                System.out.print("Ingrese posición a modificar: ");
                                p = sc.nextInt();

                                if (p >= 0 && p < vehiculos.size()) {
                                    vehiculos.remove(p);
                                } else {
                                    System.out.println("La posición dada no es válida\n");
                                }
                        }
                        break;
                    case 4://Compra/Venta de vehículos por parte de un cliente
                        System.out.print("\n1-> Comprar\n" + "2-> Vender\n" + "Ingrese su opcion: ");
                        op = sc.nextInt();

                        switch (op) {
                            case 1:
                                ListarConcesionarios();
                                System.out.println("Ingrese posición de la concesionaria: ");
                                int pos = sc.nextInt();
                                String s = "";

                                for (Vehiculo t : concesionaria.get(pos).getVehiculos()) {
                                    s += "\n" + concesionaria.indexOf(t) + " - " + t + "\n";
                                    System.out.println(s);
                                }

                                System.out.print("Ingrese la posición del vehículo que quiere comprar: ");
                                int carro = sc.nextInt();

                                if (carro < concesionaria.size()) {
                                    ListarClientes();
                                    System.out.print("Ingrese posición del cliente en cuestión: ");
                                    int c = sc.nextInt();

                                    if (c < concesionaria.get(pos).getClientes().size()) {
                                        double precio = (concesionaria.get(pos).getVehiculos().get(carro).getPrecio()) * 107.5;//precio a pagar

                                        if (clientes.get(c).getSaldo() <= precio) {
                                            double saldot = clientes.get(c).getSaldo();
                                            saldot -= precio;
                                            clientes.get(c).setSaldo(saldot);//establecer nuevo saldo
                                            double saldoconce = 
                                            concesionaria.get(pos).getVehiculos().get(carro).setPrecio(precio);//agregar saldo a la concesionaria
                                            concesionaria.get(pos).getClientes().add(clientes.get(c));//Agregar cliente a la concesionaria
                                        } else {
                                            System.out.println("Lo siento, no posee con el saldo suficiente para realizar esta compra\n");
                                        }
                                    }
                                } else {
                                    System.out.println("La posición no es válida");
                                }
                            case 2:
                                ListarClientes();
                                System.out.print("Ingrese posición del cliente en cuestión: ");
                                int c = sc.nextInt();

                                s = "";
                                if (c < clientes.size()) {
                                    for (Vehiculo t : clientes.get(c).getVehiculos()) {
                                        s += "\n" + concesionaria.indexOf(t) + " - " + t + "\n";
                                        System.out.println(s);
                                    }

                                    System.out.print("Ingrese la posición del vehículo que quiere vender: ");
                                    carro = sc.nextInt();

                                    if (carro < clientes.get(c).getVehiculos().size()) {
                                        ListarConcesionarios();
                                        System.out.print("Ingrese la posición de la concesionaria a la que se le venderá el vehículo: ");
                                        pos = sc.nextInt();

                                        double precio = (clientes.get(c).getVehiculos().get(carro).getPrecio());
                                        
                                        if (concesionaria.get(pos).getSaldo()<=precio) {
                                            double saldo = concesionaria.get(pos).getSaldo();
                                            saldo-=precio;
                                            concesionaria.get(pos).setSaldo(saldo);
                                            
                                            double saldoclientes = clientes.get(c).getSaldo();
                                            saldoclientes+=precio;
                                            clientes.get(c).setSaldo(saldoclientes);
                                        }
                                    
                                        
                                }

                        }
                }
            }

        }

    }
    while (opcion 
!= 5);
    }

    static Concesionaria newC() {
        System.out.print("Saldo: ");
        double saldo = sc.nextInt();
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
        System.out.print("Saldo: ");
        double saldo = sc.nextInt();
        System.out.print("Nombre: ");
        sc = new Scanner(System.in);
        String name = sc.nextLine();
        Cliente cl = new Cliente(clientes.size() + 1, name, saldo);
        return cl;
    }

    static Vehiculo newV() {
        String tipo = "";
        System.out.print("Color: ");
        String color = sc.next();
        System.out.print("Marca: ");
        String marca = sc.next();
        System.out.print("Modelo: ");
        String modelo = sc.next();
        System.out.print("Año de fabricación: ");
        int año = sc.nextInt();
        System.out.print("Cantidad de llantas: ");
        int cantll = sc.nextInt();
        System.out.print("Precio: ");
        double precio = sc.nextInt();

        if (cantll == 2) {
            System.out.print("\n1-> Motocicleta\n" + "2-> Bicicleta\n" + "Ingrese su opcion: ");
            int p = sc.nextInt();
            switch (p) {
                case 1:
                    boolean b = true;
                    System.out.print("Desplazamiento del motor: ");
                    sc = new Scanner(System.in);
                    String desplazamiento = sc.nextLine();
                    System.out.print("¿La motocicleta es eléctrica? [n/s]: ");
                    char resp = sc.next().charAt(0);
                    if (resp == 'n' || resp == 'N') {
                        b = false;
                    }
                    Motocicleta m = new Motocicleta(desplazamiento, b, color, marca, modelo, año, cantll, precio);
                    return m;
                case 2:
                    System.out.print("Descripción: ");
                    sc = new Scanner(System.in);
                    String descripcion = sc.nextLine();
                    System.out.print("Radio de la rueda: ");
                    int radio = sc.nextInt();
                    System.out.print("\n1-> BMX\n" + "2-> De calle\n" + "Ingrese su opcion: ");
                    int t = sc.nextInt();
                    if (t == 1) {
                        tipo = "BMX";
                    } else if (t == 2) {
                        tipo = "De calle";
                    }
                    Bicicleta bici = new Bicicleta(descripcion, radio, tipo, color, marca, modelo, año, cantll, precio);
                    return bici;
            }
        } else if (cantll == 4) {
            System.out.print("\n1-> Carro\n" + "2-> Camion de carga\n" + "3-> Bus\n" + "Ingrese su opcion: ");
            int p = sc.nextInt();
            switch (p) {
                case 1://CARRO
                    System.out.print("Cantidad de puertas: ");
                    int cant1 = sc.nextInt();
                    System.out.print("Descripción de motor: ");
                    sc = new Scanner(System.in);
                    String descripcion = sc.nextLine();
                    System.out.print("Velocidad máxima: ");
                    int velocidad = sc.nextInt();
                    Carro car = new Carro(cant1, velocidad, descripcion, color, marca, modelo, año, cantll, precio);
                    return car;
                case 2://CAMION
                    boolean b = true;
                    System.out.println("Volumen: ");
                    int volumen = sc.nextInt();
                    System.out.println("Máximo de carga: ");
                    int carga = sc.nextInt();
                    System.out.println("Altura");
                    int altura = sc.nextInt();
                    System.out.print("¿El camión tiene retroexcavadora? [n/s]: ");
                    char resp = sc.next().charAt(0);
                    if (resp == 'n' || resp == 'N') {
                        b = false;
                    }
                    Camion c = new Camion(volumen, carga, altura, b, color, marca, modelo, año, cantll, precio);
                    return c;
                case 3://BUS
                    System.out.println("Cantidad de pasajeros: ");
                    int pasajeros = sc.nextInt();
                    Bus bus = new Bus(pasajeros, color, marca, modelo, año, cantll, precio);
                    return bus;
            }
        }
        return new Vehiculo();
    }

    static void Listar() {
        String s = "";

        System.out.print("¿Desea listar algún tipo en específico? [n/s]: ");
        char resp = sc.next().charAt(0);

        if (resp == 's' || resp == 'S') {
            System.out.print("\n1-> Carro\n" + "2-> Camion de carga\n" + "3-> Bus\n" + "4-> Motocicleta\n" + "5-> Bicicleta\n"
                    + "Ingrese su opcion: ");
            int p = sc.nextInt();

            switch (p) {
                case 1:
                    for (Object t : vehiculos) {
                        if (t instanceof Carro) {
                            s += "\n" + vehiculos.indexOf(t) + " - " + t + "\n";
                            System.out.println(s);
                        }
                    }
                    break;
                case 2:
                    for (Object t : vehiculos) {
                        if (t instanceof Camion) {
                            s += "\n" + vehiculos.indexOf(t) + " - " + t + "\n";
                            System.out.println(s);
                        }
                    }
                    break;
                case 3:
                    for (Object t : vehiculos) {
                        if (t instanceof Bus) {
                            s += "\n" + vehiculos.indexOf(t) + " - " + t + "\n";
                            System.out.println(s);
                        }
                    }
                case 4:
                    for (Object t : vehiculos) {
                        if (t instanceof Motocicleta) {
                            s += "\n" + vehiculos.indexOf(t) + " - " + t + "\n";
                            System.out.println(s);
                        }
                    }
                case 5:
                    for (Object t : vehiculos) {
                        if (t instanceof Bicicleta) {
                            s += "\n" + vehiculos.indexOf(t) + " - " + t + "\n";
                            System.out.println(s);
                        }
                    }
            }
        } else {
            for (Object t : vehiculos) {
                if (t instanceof Carro) {
                    s += "\n" + vehiculos.indexOf(t) + " - " + t + "\n";
                }
            }

            for (Object t : vehiculos) {
                if (t instanceof Camion) {
                    s += "\n" + vehiculos.indexOf(t) + " - " + t + "\n";
                }
            }

            for (Object t : vehiculos) {
                if (t instanceof Bus) {
                    s += "\n" + vehiculos.indexOf(t) + " - " + t + "\n";
                }
            }

            for (Object t : vehiculos) {
                if (t instanceof Motocicleta) {
                    s += "\n" + vehiculos.indexOf(t) + " - " + t + "\n";
                }
            }
            for (Object t : vehiculos) {
                if (t instanceof Bicicleta) {
                    s += "\n" + vehiculos.indexOf(t) + " - " + t + "\n";
                }
            }
            System.out.println(s);
        }
    }

    static void ListarClientes() {
        String s = "";
        for (Object t : clientes) {
            s += "\n" + clientes.indexOf(t) + " - " + t + "\n";
            System.out.println(s);
        }
    }

    static void ListarConcesionarios() {
        String s = "";
        for (Object t : concesionaria) {
            s += "\n" + concesionaria.indexOf(t) + " - " + t + "\n";
            System.out.println(s);
        }
    }
}
