package ABSTRACTAS;

import INTERFACES.IProducto;

abstract public class Producto implements IProducto {

/*------------------ATRIBUTOS--------------------*/
    protected int precio;
/*------------------ATRIBUTOS--------------------*/

/*------------------GETTER--------------------*/
    @Override
    public int getPrecio() {
        return precio;
    }
/*------------------GETTER--------------------*/

/*------------------MÉTODOS--------------------*/
    public String imprimir(){
        return null;
    };
/*------------------MÉTODOS--------------------*/


/*------------------CONSTRUCTOR--------------------*/
    public Producto(int precio) {
        this.precio = precio;
    }
/*------------------CONSTRUCTOR--------------------*/

}
