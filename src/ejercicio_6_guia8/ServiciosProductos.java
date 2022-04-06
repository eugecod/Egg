package ejercicio_6_guia8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiciosProductos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> productos = new HashMap();

    public HashMap<String, Double> introducirProducto() {
        String respuesta = null;
        do {
            System.out.println("Ingrese el nombre del producto ");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto ");
            Double precio = leer.nextDouble();
            productos.put(nombre, precio);
            System.out.println("Desea ingresar otro producto? s/n");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("s"));

        return productos;
    }

    public void imprimirListaProductos() {
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Nombre = " + entry.getKey() + " Precio = " + entry.getValue());
        }
    }

    public HashMap<String, Double> cambiarPrecio() {
        String cambio = null;
        Double nuevoPrecio = 0.0;
        int control = 0;
        System.out.println("Ingrese el producto cuyo precio desea modificar ");
        cambio = leer.next();
        for(Map.Entry<String, Double> entry : productos.entrySet()) {
            
            //Double value = entry.getValue();
        String key = entry.getKey();
           if (cambio.equalsIgnoreCase(key)) {
               control = control +1;
               System.out.println("Ingrese el nuevo precio ");
                nuevoPrecio = leer.nextDouble();
                productos.put(key, nuevoPrecio);
                } }
            if(control==0){
                System.out.println("El producto no está en la lista ");
            }      
                       
        return productos ;
}

public HashMap<String, Double> eliminarProducto(){
       String productoEliminado=null;
       System.out.println("Ingrese el producto que desea eliminar de la lista ");
       productoEliminado = leer.next();
       for (Map.Entry<String, Double> entry : productos.entrySet()) {
        String key = entry.getKey();
        if (productoEliminado.equalsIgnoreCase(key)){
        productos.remove(key);
        }
           }
   
   return productos;
   } 
    
}
