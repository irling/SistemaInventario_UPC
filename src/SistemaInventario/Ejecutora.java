package SistemaInventario;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutora {
    static Scanner scanner = new Scanner(System.in);

    //ARRAYS
    static ArrayList<Servidores> servidores = new ArrayList<>();
    static ArrayList<Computadora> computadoras = new ArrayList<>();
    static ArrayList<Laptop> laptops = new ArrayList<>();
    static ArrayList<Impresora> impresoras = new ArrayList<>();

    public static void main(String[] args) {

        menuInicio();
        añadirItem();

    }


    public static void menuInicio(){
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
                case 1: añadirItem();
                    break;
                case 2: listarItem();
                    break;
                case 3: //UPDATE
                    break;
                case 4: //DELETE
                    break;
                case 5:
                    System.exit(0);
                };
            }

    public static void añadirItem(){
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
                case 1: añadirComputadora();
                    break;
                case 2: //COMPU
                    break;
                case 3: //IMPR
                    break;
                case 4: //SRV
                    break;
                case 5: menuInicio();
                    break;

            }
    }

    //AÑADIR ITEM'S
    public static void añadirComputadora(){
         int id;
         String modelo;
         String marca;
         int ano;
         String serial_number;
         String estado;
         int stock;

         String procesador;
         int ram;
         double almacenamiento;
         String gpu;
         int fuente;

        System.out.println("===== INGRESE LOS DATOS =====");
        System.out.println("ID: ");
        id = scanner.nextInt();
        System.out.println("Modelo: ");
        modelo = scanner.next();
        System.out.println("Marca: ");
        marca = scanner.next();
        System.out.println("Año: ");
        ano = scanner.nextInt();
        System.out.println("SN: ");
        serial_number = scanner.next();
        System.out.println("Estado: ");
        estado = scanner.next();
        System.out.println("Stock: ");
        stock = scanner.nextInt();

        System.out.println("Procesador: ");
        procesador = scanner.next();
        System.out.println("RAM: ");
        ram = scanner.nextInt();
        System.out.println("ALMACENAMIENTO: ");
        almacenamiento = scanner.nextDouble();
        System.out.println("GPU: ");
        gpu = scanner.next();
        System.out.println("FUENTE: ");
        fuente = scanner.nextInt();

        Computadora computadora = new Computadora(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento,gpu, fuente);

        computadoras.add(computadora);
    }


    //LISTAR ITEM'S
    public static void  listarItem(){
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
            case 1: listarComputadora();
                break;
            case 2: //COMPU
                break;
            case 3: //IMPR
                break;
            case 4: //SRV
                break;
        }
    }

    public static void listarComputadora(){
        for (Computadora comp : computadoras){
            comp.ObtenerComputadora();
        }
    }

}

