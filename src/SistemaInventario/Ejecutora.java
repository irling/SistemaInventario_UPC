package SistemaInventario;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutora {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        MenuInicio();
        MenuAñadirItem();
        MenulistarItem();

    }

    //MENUS
    public static void MenuInicio(){
        int opcion;

        do {
            System.out.println("(CRUD) Ingrese lo que desee realizar: ");
            System.out.println("1.- Añadir un item al inventario");
            System.out.println("2.- Listar todos los items que hay en el inventario");
            System.out.println("3.- Actualizar un item dentro del inventario");
            System.out.println("4.- Eliminar un item dentro del inventario");
            System.out.println("5.- Salir");
            System.out.println("Opcion: ");
            opcion = scanner.nextInt();

        }while (opcion<1 || opcion>5);
        switch (opcion){
            case 1: MenuAñadirItem();
                break;
            case 2: MenulistarItem();
                break;
            case 3: //UPDATE
                break;
            case 4: //DELETE
                break;
            case 5:
                System.exit(0);
        };
    }
    public static void MenuAñadirItem(){
        int opcion;
            do {
                System.out.println("Que desea ingresar: ");
                System.out.println("1.- Computadora");
                System.out.println("2.- Laptop");
                System.out.println("3.- Impresora");
                System.out.println("4.- Servidor");
                System.out.println("5.- Regresar al menu principal");
                opcion = scanner.nextInt();

            }while (opcion<1 || opcion>5);
            switch (opcion){
                case 1: añadirComputadoraUser();
                    break;
                case 2: añadirLaptopUser();
                    break;
                case 3: añadirImpresoraUser();
                    break;
                case 4: añadirServidorUser();
                    break;
                case 5: MenuInicio();
                    break;

            }
    }
    public static void  MenulistarItem(){
        int opcion;
        do {
            System.out.println("Que desea listar: ");
            System.out.println("1.- Computadora");
            System.out.println("2.- Laptop");
            System.out.println("3.- Impresora");
            System.out.println("4.- Servidor");
            System.out.println("5.- Salir del menu");
            opcion = scanner.nextInt();

        }while (opcion<1 || opcion>5);
        switch (opcion){
            case 1: ListarComputadora();
                break;
            case 2: ListarLaptops();
                break;
            case 3: ListarImpresoras();
                break;
            case 4:ListarServidores();
                break;
            case 5: MenuInicio();
                break;
        }
    }

    //AÑADIR ITEM'S
    public static void añadirComputadoraUser() {
        Computadora computadora = new Computadora();

        Scanner scanner = new Scanner(System.in);
        System.out.println("===== INGRESE LOS DATOS =====");
        System.out.println("ID: ");
        int id = scanner.nextInt();
        System.out.println("Modelo: ");
        String modelo = scanner.next();
        System.out.println("Marca: ");
        String marca = scanner.next();
        System.out.println("Año: ");
        int ano = scanner.nextInt();
        System.out.println("SN: ");
        String serial_number = scanner.next();
        System.out.println("Estado: ");
        String estado = scanner.next();
        System.out.println("Stock: ");
        int stock = scanner.nextInt();

        System.out.println("Procesador: ");
        String procesador = scanner.next();
        System.out.println("RAM: ");
        int ram = scanner.nextInt();
        System.out.println("ALMACENAMIENTO: ");
        int almacenamiento = scanner.nextInt();
        System.out.println("GPU: ");
        String gpu = scanner.next();
        System.out.println("FUENTE: ");
        int fuente = scanner.nextInt();

        computadora.añadirComputadora(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento, gpu, fuente);
    }
    public static void añadirLaptopUser() {
        Laptop laptop = new Laptop();

        Scanner scanner = new Scanner(System.in);
        System.out.println("===== INGRESE LOS DATOS =====");
        System.out.println("ID: ");
        int id = scanner.nextInt();
        System.out.println("Modelo: ");
        String modelo = scanner.next();
        System.out.println("Marca: ");
        String marca = scanner.next();
        System.out.println("Año: ");
        int ano = scanner.nextInt();
        System.out.println("SN: ");
        String serial_number = scanner.next();
        System.out.println("Estado: ");
        String estado = scanner.next();
        System.out.println("Stock: ");
        int stock = scanner.nextInt();

        System.out.println("Procesador: ");
        String procesador = scanner.next();
        System.out.println("RAM: ");
        int ram = scanner.nextInt();
        System.out.println("ALMACENAMIENTO: ");
        int almacenamiento = scanner.nextInt();
        System.out.println("BATERIA: ");
        int bateria = scanner.nextInt();


        laptop.añadirLaptop(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento, bateria);
    }
    public static void añadirServidorUser() {
        Servidores servidor = new Servidores();

        Scanner scanner = new Scanner(System.in);
        System.out.println("===== INGRESE LOS DATOS =====");
        System.out.println("ID: ");
        int id = scanner.nextInt();
        System.out.println("Modelo: ");
        String modelo = scanner.next();
        System.out.println("Marca: ");
        String marca = scanner.next();
        System.out.println("Año: ");
        int ano = scanner.nextInt();
        System.out.println("SN: ");
        String serial_number = scanner.next();
        System.out.println("Estado: ");
        String estado = scanner.next();
        System.out.println("Stock: ");
        int stock = scanner.nextInt();

        System.out.println("Procesador: ");
        String procesador = scanner.next();
        System.out.println("RAM: ");
        int ram = scanner.nextInt();
        System.out.println("ALMACENAMIENTO: ");
        int almacenamiento = scanner.nextInt();
        System.out.println("TIPO DE INSTALACION: ");
        String tipo_instalacion = scanner.next();


        servidor.añadirServidor(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento, tipo_instalacion);
    }
    public static void añadirImpresoraUser() {
        Impresora imp = new Impresora();

        Scanner scanner = new Scanner(System.in);
        System.out.println("===== INGRESE LOS DATOS =====");
        System.out.println("ID: ");
        int id = scanner.nextInt();
        System.out.println("Modelo: ");
        String modelo = scanner.next();
        System.out.println("Marca: ");
        String marca = scanner.next();
        System.out.println("Año: ");
        int ano = scanner.nextInt();
        System.out.println("SN: ");
        String serial_number = scanner.next();
        System.out.println("Estado: ");
        String estado = scanner.next();
        System.out.println("Stock: ");
        int stock = scanner.nextInt();

        System.out.println("Tipo de Impresión: ");
        String tipo_impresion = scanner.next();
        System.out.println("Consumible: ");
        String consumible = scanner.next();
        System.out.println("Velocidad de impresión: ");
        int velocidad_impresion = scanner.nextInt();

        imp.añadirImpresora(id, modelo, marca, ano, serial_number, estado, stock, tipo_impresion, consumible, velocidad_impresion);
    }

    //LISTAR ITEM'S
    public static void ListarComputadora(){
        for (Equipos_de_Computo comp : Computadora.ListaDeEquiposDeComputo){
            comp.ListarComputadoras();
        }
    }
    public static void ListarLaptops(){
        for (Equipos_de_Computo lap : Laptop.ListaDeEquiposDeComputo){
            lap.ListarLaptop();
        }
    }
    public static void ListarServidores(){
        for (Equipos_de_Computo srv : Servidores.ListaDeEquiposDeComputo){
            srv.ListarServidor();
        }
    }
    public static void ListarImpresoras(){
        for (Equipos_de_Computo lap : Laptop.ListaDeEquiposDeComputo){
            lap.ListarComputadoras();
        }
    }

}