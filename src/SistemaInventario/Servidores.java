package SistemaInventario;

public class Servidores extends Equipos_de_Computo{

    private String procesador;
    private int ram;
    private double almacenamiento;
    private String tipo_instalacion;

    public Servidores(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, double almacenamiento, String tipo_instalacion) {
        super(id, modelo, marca, ano, serial_number, estado, stock);
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tipo_instalacion = tipo_instalacion;
    }

    public void ObtenerServidor(){
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
}