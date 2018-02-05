import libreria.Producto;
import  java.util.Scanner;
    
public class AppProducto {
    
    public static Scanner Leerdatos = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("====================");
        System.out.println("=Datos de Producto =");
        System.out.println("====================");
        System.out.println("");
        System.out.println("Digita la denominacion :");
        String denominacion = Leerdatos.next();
        System.out.println("Digita el precio :");
        String precio = Leerdatos.next();
        System.out.println("Digita el id :");
        String id = Leerdatos.next();
        
        Producto nuevoProducto = new Producto(denominacion, precio, id);
        
        System.out.println("La denominacion del Producto es : " + nuevoProducto.getDenominacion());
        System.out.println("El precio del producto es : $"+ nuevoProducto.getPrecio());
        System.out.println("El id del producto es :"+ nuevoProducto.getId());       
  }
}
