package ejercicio04;
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine().toUpperCase(); 
            boolean letraEncontrada = false;
            for (String estudiante : estudiantes) {
                if (estudiante.startsWith(inicial)) {
                    System.out.println("Estudiante que comienza con '" + inicial + "': " + estudiante);
                    letraEncontrada = true;
                    break;
                }
            }

            if (!letraEncontrada) {
                System.out.println("Ningun estudiante comienza con '" + inicial + "'");
            }

            
            }
        }
    }
        // TODO code application logic here
    
    

