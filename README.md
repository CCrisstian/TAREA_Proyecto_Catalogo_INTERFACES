# <h1 align="center">**Proyecto Catalogo**</h1>

El objetivo de esta práctica es exponer los conceptos que hay detrás del polimorfismo implementando clases abstractas e interfaces.
Se requiere crear un catalogo de producto con un diseño de jerarquía de clases y uso de interfaces para los métodos (o comportamiento).

## <h2>Primero</h2>
Vamos a tener las **<< Interfaces >>** que describen el comportamiento que deberán tener las clases de la jerarquía:
### - Interface **<< IProducto >>** con dos firmas de metodos:
   * int getPrecio()
   * double getPrecioVenta()
   * String imprimir()
### - Interface **<< IElectronico >>** con una firma de método:
   * String getFabricante()
### - Interface **<< ILibro >>** con 4 firmas de métodos:
   * Date getFechaPublicacion()
   * String getAutor()
   * String getTitulo()
   * String getEditorial()

## <h2>Segundo</h2>
Vamos a tener las clases **_abstractas_** para las diferentes especializaciones de productos:
### - Clase Abstracta **_Producto_** que debe:
   * implementar la interface **<< IProducto >>**
   * atributo precio con su respectivo método getter
   * constructor
### - Clase Abstracta **_Electronico_** que debe implementar:
   * implementar la interface **<< IElectronico >>**
   * hereda de la clase abstracta **_Producto_**
   * atributo fabricante con su respectivo método getter
   *  constructor
     
## <h2>Tercero</h2>
Las 4 clases **concretas** que deben heredar de las clases **_abstractas_**, y si corresponde implementar alguna **<< interface >>**.
### - La Clase **IPhone**:
   * poner especial atención en el extends de **_Electronico_**.
   * en el método que debe implementar getPrecioVenta() de la interface **<< IProducto >>**
   * sus atributos color y modelo del tipo string
   * con sus respectivos métodos getter
   * constructor
### - La Clase **TvLcd**:
   * poner especial atención en el extends de **_Electronico_**
   * en el método que debe implementar getPrecioVenta()
   * su atributo pulgada (int) con su respectivo método get
   * constructor.
### - La Clase **Libro**:
   * debe de extender de **_Producto_** e implementar el método getPrecioVenta()
   * atributo fechaPublicacion (Date)
   * atributo autor (string)
   * atributo titulo (string)
   * atributo editorial (string)
   * con sus respectivos métodos getters
   * constructor
   * Pero ademas debe implementar la interface **<< ILibro >>**
### - La Clase **Comics**:
   * con en el extends de **_Libro_**
   * implementar el método de la interface getPrecioVenta()
   * atributo personaje (string) con su respectivo método getter
   * constructor.
 
Al final crear la clase con el método main llamada ProyectoCatalogo y crear algunas instancias de ejemplo de cada clase concreta, entre 4 a 7 objetos, asociado al tipo mas genérico posible y mostrar los datos en consola. Por ejemplo:

              IProducto[] productos = new Producto[6];
              ...
              productos[2] = new TvLcd(340000, "Sony", 40);
              productos[3] = new Libro(18000, "Eric Gamma", "Elementos reusables POO", "Alguna...");
              productos[4] = new Libro(14000, "Martin Fowler", "UML Gota a Gota", "Alguna...");
              ...

Diagrama UML de clases como una guía, los métodos getters y constructores se omitieron para simplificar, pero deben ir en el código, solo aparecen los métodos get a implementar de las interfaces.

  ![image](https://github.com/CCrisstian/TAREA_Proyecto_Catalogo_INTERFACES/assets/111469216/cac3d9bf-b4d6-4d0f-a483-6b65ee4b94c0)
