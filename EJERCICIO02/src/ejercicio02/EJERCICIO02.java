package ejercicio02;
public class EJERCICIO02 {
    public static void main(String[] args) {
         int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int sumaArr = 0;               
        for(int numero : arreglo)
            sumaArr += numero;            
        int promedio = sumaArr / arreglo.length;   
        int nroMayorMedia = 0;
        int nroMenorMedia = 0;             
         for(int numero : arreglo){             
             if(numero > promedio){
                 System.out.println(numero + " está por encima de la media");
                 nroMayorMedia++;
                 continue;
             }                
             if(numero < promedio){
                 System.out.println(numero + " está por debajo de la media");
                 nroMenorMedia++;
                 continue;
             }
             
             System.out.println(numero + " es un número igual al promedio");
         }
         
         System.out.println("El total de numeros mayor a la media es de: " + nroMayorMedia);
         System.out.println("El total de números menor a la media es de: " + nroMenorMedia);
    }
}
    
    

