import java.util.Locale;

public class ejercicio10 {
    public static void main(String[] args) {
        double[] notasNumericas = {4.2, 5.0, 6.8, 8.5, 9.8, 3.5, 7.2, 9.0};
        int alumnosAprobados = 0;
        //Configuracion para que la salida se expresen los decimales con . en vez de con ,
        Locale.setDefault(Locale.US);
        //Salidas de cabecera que solo van 1 vez fuera del bucle for para que no aparezcan en cada ciclo
        System.out.println("================================================");
        System.out.println("CONVERSIÓN DE CALIFICACIONES A SISTEMA ECTS");
        System.out.println("================================================");
        System.out.println("Nota | Calificación Cualitativa | ECTS");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < notasNumericas.length; i++) {
            double notaActual = notasNumericas[i];

            if (notaActual >= 5.0) {
                alumnosAprobados++;
            }

            // Pasamos 'notaActual', NO 'i'
            String notaEscrita = calcularNotas(notaActual);
            char notaCaracter = calcularLetraEcts(notaActual);
            
            // Aquí imprime la fila con System.out.printf(...)
            System.out.printf("%.1f  | %-20s | %c%n", notaActual, notaEscrita, notaCaracter);
        }
        // Aquí fuera del for calcula el porcentaje e imprime el resumen
            int totalAlumnosEvaluados = notasNumericas.length;
            double porcentajeAprobados = ((double) alumnosAprobados / notasNumericas.length) * 100.0;
            
            System.out.printf("------------------------------------------------%n");
            System.out.printf("Total evaluados: %d | Aprobados: %d (%.2f%%)%n", totalAlumnosEvaluados, alumnosAprobados, porcentajeAprobados);
    }

    //Switch moderno en el que no hace falta poner brake, 
    public static String calcularNotas(double notas) {
        return switch ((int) (notas * 2)) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> "Suspenso";
            // Añade aquí los casos para Aprobado (10-12), Notable (13-15), Sobresaliente (16-18) y MH (19-20)
            case 10, 11, 12 -> "Aprobado";
            case 13, 14, 15 -> "Notable";
            case 16, 17, 18 -> "Sobresaliente";
            case 19, 20 -> "Matricula de Honor";
            default -> "Nota inválida";
        };
    }
    public static char calcularLetraEcts(double notas){
        return switch ((int) (notas * 2)){
            case 0,1,2,3,4,5,6,7,8,9 -> 'F';
            case 10,11,12 -> 'E';
            case 13,14,15 -> 'C';
            case 16,17,18 -> 'B';
            case 19,20 -> 'A';
            default -> '?';
        };
    }
}