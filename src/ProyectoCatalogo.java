import ABSTRACTAS.Producto;
import CONCRETAS.*;
import INTERFACES.IProducto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ProyectoCatalogo {
    public static void main(String[] args) throws ParseException {

        IProducto[] productos = new Producto [6];

        productos[0] = new IPhone(1999999,"Apple","Gris","12");

        productos[1] = new TvLcd(340000,"Sony",40);

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaEspecifica = formato.parse("01-01-2024");

        productos[2] = new Libro(18000,fechaEspecifica,"Eric Gamma","Elementos reusables POO","Curso JAVA");
        productos[3 ] = new Libro(14000,fechaEspecifica,"Martin Fowler","UML Gota a Gota","Curso JAVA");

        fechaEspecifica = formato.parse("13-11-2023");
        productos[4] = new Comics(4054,fechaEspecifica,"Zeb Wells","The Amazing Spider-Man (2022) #40","MARVEL","Spider-Man");

        fechaEspecifica = formato.parse("26-03-2013");
        productos[5] = new Comics(27000,fechaEspecifica,"Scott Snyder","Batman Vol. 1: The Court of Owls (The New 52)","DC","Batman");

        for (IProducto elemento : productos) {
            System.out.println(elemento.imprimir());
        }
    }
}