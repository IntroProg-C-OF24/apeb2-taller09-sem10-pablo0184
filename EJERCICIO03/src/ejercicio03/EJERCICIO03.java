package ejercicio03;
public class EJERCICIO03 {
    public static void main(String[] args) {
            double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCualitativos = new String[promedios.length];
        for (int i = 0; i < promediosCualitativos.length; i++) {
            double promedioActual = promedios[i];
            String estudianteActual = estudiantes[i];
            String promedioCualitativo;
            if (promedioActual >= 0 && promedioActual <= 5.9) {
                promedioCualitativo = "Promedio regular";
            } else if (promedioActual <= 8.9) {
                promedioCualitativo = "Promedio bueno";
            } else if (promedioActual <= 10) {
                promedioCualitativo = "Promedio sobresaliente";
            } else {
                promedioCualitativo = "Promedio fuera de los rangos";
            }
            promediosCualitativos[i]
                    = estudianteActual + " promedio: " + promedioActual + ". Lo que califica en " + promedioCualitativo;
        }              
        for (String estudiante : promediosCualitativos) 
            System.out.println(estudiante);               
    }
}
    
    

