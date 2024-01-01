package CONCRETAS;

import ABSTRACTAS.Electronico;
import INTERFACES.IElectronico;
import INTERFACES.IProducto;

public class TvLcd extends Electronico{

/*------------------ATRIBUTOS--------------------*/
    private int pulgada;
/*------------------ATRIBUTOS--------------------*/

/*------------------GETTER--------------------*/
    public int getPulgada() {
        return pulgada;
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
        sb.append("\nPulgada: ").append(this.pulgada);
        return sb.toString();
    }

/*------------------MÉTODOS--------------------*/

/*------------------CONSTRUCTOR--------------------*/
    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }
/*------------------CONSTRUCTOR--------------------*/

}
