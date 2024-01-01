package CONCRETAS;

import ABSTRACTAS.Producto;
import INTERFACES.ILibro;
import INTERFACES.IProducto;

import java.util.Date;

public class Libro extends Producto implements ILibro{

/*------------------ATRIBUTOS--------------------*/
   private Date fechaPublicación;
   private String autor;
   private String titulo;
   private String editorial;
/*------------------ATRIBUTOS--------------------*/

/*------------------GETTER--------------------*/
    @Override
    public Date getFechaPublicación() {
        return this.fechaPublicación;
    }

        @Override
        public String getAutor() {
            return this.autor;
        }

        @Override
        public String getTitulo() {
            return this.titulo;
        }

        @Override
        public String getEditorial() {
            return this.editorial;
        }
/*------------------GETTER--------------------*/

/*------------------MÉTODOS--------------------*/
    @Override
    public double getPrecioVenta() {
        return this.precio;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPrecio: ").append(this.precio);
        sb.append("Fecha de publicación: ").append(this.fechaPublicación.toString());
        sb.append("\nAutor:").append(this.autor);
        sb.append("\nTitulo: ");

        return sb.toString();
    }

/*------------------MÉTODOS--------------------*/

/*------------------CONSTRUCTOR--------------------*/
    public Libro(int precio, Date fechaPublicación, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicación = fechaPublicación;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }
/*------------------CONSTRUCTOR--------------------*/

}
