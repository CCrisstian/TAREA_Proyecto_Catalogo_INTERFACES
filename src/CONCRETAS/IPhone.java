package CONCRETAS;

import ABSTRACTAS.Electronico;

public class IPhone extends Electronico{

/*------------------ATRIBUTOS--------------------*/
    private String color;
    private String modelo;
/*------------------ATRIBUTOS--------------------*/

/*------------------GETTER--------------------*/
    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }
/*------------------GETTER--------------------*/

/*------------------MÉTODOS--------------------*/
    @Override
    public double getPrecioVenta() {
        return this.precio;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder(super.imprimir());
        sb.append("\nProducto: ").append(getClass().getSimpleName());
        sb.append("\nColor: ").append(this.color);
        sb.append("\nModelo: ").append(this.modelo);
        sb.append("\n\n----------------------------------------------------------------");
        return sb.toString();    }

    /*------------------MÉTODOS--------------------*/

/*------------------CONSTRUCTOR--------------------*/
    public IPhone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }
/*------------------CONSTRUCTOR--------------------*/

}
