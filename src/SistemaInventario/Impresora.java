package SistemaInventario;

public class Impresora extends Equipos_de_Computo{
    private String tipo_impresion;
    private String consumible;
    private int velocidad_impresion;

    public Impresora(){}
    public Impresora(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String tipo_impresion, String consumible, int velocidad_impresion) {
        super(id, modelo, marca, ano, serial_number, estado, stock);
        this.tipo_impresion = tipo_impresion;
        this.consumible = consumible;
        this.velocidad_impresion = velocidad_impresion;
    }
    public void añadirImpresora(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock,String tipo_impresion, String consumible, int velocidad_impresion){
        Impresora imp = new Impresora(id, modelo, marca, ano, serial_number, estado, stock,tipo_impresion, consumible, velocidad_impresion );
        ListaDeEquiposDeComputo.add(imp);
    }

    public void ListarImpresora(){
        System.out.println("Laptop { " + "ID: " + getId() +
                " \nModelo: " + getModelo() +
                " \nMarca: " + getMarca() +
                " \nAño: " + getAno() +
                " \nNúmero de serie: " + getSerial_number() +
                " \nEstado: " + getEstado() +
                " \nStock disponible: " + getStock() +
                " \nTipo de Impresión: " + tipo_impresion +
                " \nConsumible: " + consumible +
                " \nVelocidad de Impresión: " + velocidad_impresion + "PPM" +
                "}\n");
    }
}
