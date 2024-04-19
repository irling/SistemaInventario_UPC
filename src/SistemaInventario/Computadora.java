package SistemaInventario;

public class Computadora extends Equipos_de_Computo {
    private String procesador;
    private int ram;
    private double almacenamiento;
    private String gpu;
    private int fuente;

    public Computadora(int id, String modelo, String marca, int ano, String serial_number,
                       String estado, int stock, String procesador, int ram, double almacenamiento,
                       String gpu, int fuente) {

        super(id, modelo, marca, ano, serial_number, estado, stock);
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.gpu = gpu;
        this.fuente = fuente;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getRam() {
        return ram;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public String getGpu() {
        return gpu;
    }

    public int getFuente() {
        return fuente;
    }

    public void ObtenerComputadora(){
        System.out.println("Computadora { " + "ID: " + getId() +
                " \nModelo: " + getModelo() +
                " \nMarca: " + getMarca() +
                " \nAño: " + getAno() +
                " \nNúmero de serie: " + getSerial_number() +
                " \nEstado: " + getEstado() +
                " \nStock disponible: " + getStock() +
                " \nProcesador: " + procesador +
                " \nMemoria Ram: " + ram + " GB " +
                " \nAlmacenamiento: " + almacenamiento + " TB " +
                " \nTarjeta Grafica: "+ gpu +
                " \nFuente de: " + fuente + " W" +
                "} \n");
    }
}
