
package ejercicio01;
import java.util.Scanner;
public class EJERCICIO01 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de marca de vehiculos que va a registrar: ");
        int cantidadVehiculos = teclado.nextInt();
        teclado.nextLine();
        
        String vehiculosArray[] = new String[cantidadVehiculos];
        String marcaVehiculoActual = "";
        for (int i = 0; i < vehiculosArray.length; i++) {
            System.out.println("Ingrese el nombre de la marca para el auto ." + (i + 1));
            marcaVehiculoActual = teclado.nextLine();

            if (marcaVehiculoActual.startsWith("A")
                    || marcaVehiculoActual.startsWith("C")
                    || marcaVehiculoActual.startsWith("T")) {
                System.out.println("Marca no valida. Intente nuevamente");
                i--; 
                continue; 
            }
              vehiculosArray[i] = marcaVehiculoActual;
       
        }
                
        System.out.println("MARCAS");
        for(String marcaVehiculo : vehiculosArray){
            System.out.println("Marca: " + marcaVehiculo);
        }

    }

}
            
        
        
    
    

 
 

    

      
    
            
        
      
            
            
            
        
        
        
        
      

