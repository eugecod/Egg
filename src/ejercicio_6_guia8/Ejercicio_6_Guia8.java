/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos productos que venderemos y 
el precio que tendrán. 
Además, se necesita que la aplicación cuente con las funciones básicas. Estas las realizaremos en el main. 
* Introducir un elemento, 
* Modificar su precio, 
* Eliminar un producto 
* y mostrar los productos que tenemos con su precio

(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ejercicio_6_guia8;

import java.util.HashMap;



public class Ejercicio_6_Guia8 {

    public static void main(String[] args) {
    HashMap<String, Double> productosTienda = new HashMap();
    ServiciosProductos sp = new ServiciosProductos();
     
sp.introducirProducto();
sp.imprimirListaProductos();
        System.out.println("---------------------");
        System.out.println("    ");
sp.cambiarPrecio();
sp.imprimirListaProductos();
System.out.println("---------------------");
        System.out.println("    ");
sp.eliminarProducto();
sp.imprimirListaProductos();

    }
    
}
