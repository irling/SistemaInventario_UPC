package SistemaInventario;

public class Laptop extends Equipos_de_Computo{
    private String procesador;
    private int ram;
    private double almacenamiento;
    private int bateria;

    public Laptop(){}
    public Laptop(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, double almacenamiento, int bateria) {
        super(id, modelo, marca, ano, serial_number, estado, stock);
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.bateria = bateria;
    }

    public void añadirLaptop(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, int almacenamiento, int bateria){
        Laptop laptop = new Laptop(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento, bateria);
        ListaDeEquiposDeComputo.add(laptop);
    }
    public void ListarLaptop(){
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
                " \nTamaño de Bateria: " + bateria + " MaH" +
                "}\n");
    }
}
