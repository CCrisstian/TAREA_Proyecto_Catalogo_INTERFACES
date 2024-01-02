package CONCRETAS;

import ABSTRACTAS.Producto;
import INTERFACES.ILibro;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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
        sb.append("\nProducto: ").append(getClass().getSimpleName());
        sb.append("\nPrecio: ").append(this.precio);

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd MMMM yyyy", new Locale("es", "ES"));

        String fechaFormateada = formatoFecha.format(this.fechaPublicación);

        sb.append("\nFecha de publicación: ").append(fechaFormateada);
        sb.append("\nAutor: ").append(this.autor);
        sb.append("\nTitulo: ").append(this.titulo);
        sb.append("\nEditorial: ").append(this.editorial);
        if ((getClass().getSimpleName()).equals("Comics")){
            return sb.toString();}
        else{sb.append("\n\n----------------------------------------------------------------");}
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
