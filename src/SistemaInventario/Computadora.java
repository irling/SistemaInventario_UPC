package SistemaInventario;

public class Computadora extends Equipos_de_Computo {

    private String procesador;
    private int ram;
    private int almacenamiento;
    private String gpu;
    private int fuente;

    public Computadora(){}
    public Computadora(int id, String modelo, String marca, int ano, String serial_number,
                       String estado, int stock, String procesador, int ram, int almacenamiento,
                       String gpu, int fuente) {

        super(id, modelo, marca, ano, serial_number, estado, stock);
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.gpu = gpu;
        this.fuente = fuente;
    }

    //METODOS PARA EL CRUD

    public void añadirComputadora(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, int almacenamiento, String gpu, int fuente){
        Computadora computadora = new Computadora(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento, gpu, fuente);
        ListaDeEquiposDeComputo.add(computadora);
    }
    public void ListarComputadoras(){
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
