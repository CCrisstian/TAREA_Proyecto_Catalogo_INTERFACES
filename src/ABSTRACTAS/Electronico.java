package ABSTRACTAS;

import INTERFACES.IElectronico;

abstract public class Electronico extends Producto implements IElectronico {

/*------------------ATRIBUTOS--------------------*/
   protected String fabricante;
/*------------------ATRIBUTOS--------------------*/

/*------------------GETTER--------------------*/
    @Override
    public String getFabricante() {
        return fabricante;
    }
/*------------------GETTER--------------------*/

/*------------------MÉTODOS--------------------*/
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nFabricante: "+this.fabricante);
        sb.append("\nPrecio: "+this.precio);
        return sb.toString();
    }
/*------------------MÉTODOS--------------------*/


/*------------------CONSTRUCTOR--------------------*/
    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }
/*------------------CONSTRUCTOR--------------------*/

}
