package SistemaInventario;

import java.util.Iterator;
import java.util.NoSuchElementException;
public class Servidor extends Equipos_de_Computo{

    private String procesador;
    private int ram;
    private double almacenamiento;
    private String tipo_instalacion;

    public Servidor(){}
    public Servidor(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, double almacenamiento, String tipo_instalacion) {
        super(id, modelo, marca, ano, serial_number, estado, stock);
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tipo_instalacion = tipo_instalacion;
    }

    public void añadirServidor(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, int almacenamiento, String tipo_instalacion){
        Servidor servidor = new Servidor(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento, tipo_instalacion);
        ListaDeEquiposDeComputo.add(servidor);
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public void setTipo_instalacion(String tipo_instalacion) {
        this.tipo_instalacion = tipo_instalacion;
    }
    public void ListarServidor(){
        System.out.println("Laptop { " + "ID: " + getId() +
                " \nModelo: " + getModelo() +
                " \nMarca: " + getMarca() +
                " \nAño: " + getAno() +
                " \nNúmero de serie: " + getSerial_number() +
                " \nEstado: " + getEstado() +
                " \nStock disponible: " + getStock() +
                " \nProcesador: " + procesador +
                " \nMemoria Ram: " + ram + " GB " +
                " \nAlmacenamiento: " + almacenamiento + " TB " +
                " \nTipo de Instalación: "+ tipo_instalacion +
                "}\n");
    }


    public void editarservidor(int id, String modelo,String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, int almacenamiento, String tipo_instalacion) throws NoSuchElementException {
        boolean encontrado = false;
    for (Equipos_de_Computo equipo : ListaDeEquiposDeComputo) {
        if (equipo instanceof Servidor && equipo.getId() == id) {
            // Actualizar los campos relevantes de la computadora existente
            Servidor servidor = (Servidor) equipo;
            servidor.setModelo(modelo);
            servidor.setMarca(marca);
            servidor.setAno(ano);
            servidor.setSerial_number(serial_number);
            servidor.setEstado(estado);
            servidor.setStock(stock);
            servidor.setProcesador(procesador);
            servidor.setRam(ram);
            servidor.setAlmacenamiento(almacenamiento);
            servidor.setAlmacenamiento(almacenamiento);
            servidor.setTipo_instalacion(tipo_instalacion);
            encontrado = true;
            System.out.println("El servidor con ID " + id + " ha sido actualizada exitosamente.");
            break;
        }
    }
    if (!encontrado) {
        throw new NoSuchElementException("No se encontró un servidor con el ID especificado.");
    }
    }
    public void eliminarServidor(int id) throws NoSuchElementException {
        Iterator<Equipos_de_Computo> iterador = ListaDeEquiposDeComputo.iterator();
        boolean eliminado = false;
        while (iterador.hasNext()) {
            Equipos_de_Computo equipo = iterador.next();
            if (equipo instanceof Servidor && equipo.getId() == id) {
                iterador.remove();
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {
            throw new NoSuchElementException("No se encontró un servidor con el ID especificado.");
        }
    }
}