package libreria;


public class AppCliente{
    public static Scanner Leerdatos = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Digita el nombre :");
        String nombre = Leerdatos.next();
        System.out.println("Digita la identificacion:");
        String identificacion = Leerdatos.next();
        System.out.println("Digita el contacto :");
        String contacto = Leerdatos.next();
        
        Cliente miCliente = new Cliente(nombre, identificacion, contacto);
        System.out.println("");
        System.out.println("Datos del cliente ");
        System.out.println("");
        System.out.println("Nombre: "+ miCliente.getNombre());
        System.out.println("Identificacion: "+ miCliente.getIdentificacion());
        System.out.println("Contacto: "+ miCliente.getContacto());
               
               
    }    

}
