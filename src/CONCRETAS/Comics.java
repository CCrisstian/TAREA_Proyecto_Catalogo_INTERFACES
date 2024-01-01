package CONCRETAS;

import ABSTRACTAS.Producto;
import INTERFACES.IProducto;

import java.util.Date;

public class Comics extends Libro {

/*------------------ATRIBUTOS--------------------*/
   private String personaje;
/*------------------ATRIBUTOS--------------------*/

/*------------------GETTER--------------------*/
    public String getPersonaje() {
        return personaje;
    }
/*------------------GETTER--------------------*/

/*------------------MÉTODO--------------------*/
    @Override
    public double getPrecioVenta() {
        return this.precio;
    }
/*------------------MÉTODO--------------------*/

/*------------------CONSTRUCTOR--------------------*/
    public Comics(int precio, Date fechaPublicación, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicación, autor, titulo, editorial);
        this.personaje = personaje;
    }
/*------------------CONSTRUCTOR--------------------*/

}
