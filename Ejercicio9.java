import java.util.Locale;

/**
 * ejercicios
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double[] consumoRegistrado = { 0.4, 0.3, 0.2, 0.2, 0.3, 0.4, 0.6, 0.8, 1.2, 1.5, 2.4, 3.1, 2.8, 2.2, 1.4, 1.3, 1.2, 1.1, 2.5, 3.4, 2.9, 2.1, 1.3, 0.8 };

        
        double consumoValle = 0;
        double consumoLlano = 0;
        double consumoPunta = 0;
        double consumoPico = consumoRegistrado[0];
        int horaPico = 0;
        for(int i = 0; i < consumoRegistrado.length; i ++)
        if(i <= 7){
                consumoValle += consumoRegistrado[i];
                
            }else if ((i >= 8 && i <= 9) || (i >= 14 && i <= 17) || (i >= 22 && i <= 23)){
                consumoLlano += consumoRegistrado[i];
            } else if ((i >= 10 && i <= 13) || (i >= 18 && i <= 21)){
                consumoPunta += consumoRegistrado[i]; 
            

            if (consumoRegistrado[i] > consumoPico) {
                consumoPico = consumoRegistrado[i];
                horaPico = i;
            }
        }
            double costeValle = consumoValle * 0.10;
            double costeLlano = consumoLlano * 0.18;
            double costePunta = consumoPunta * 0.28;
            double consumoTotal = consumoValle + consumoLlano + consumoPunta;
            double costeTotal = costeValle + costeLlano + costePunta;

            System.out.printf("Tramo Valle: %.2f %.2f %n",consumoValle, costeValle);
            System.out.printf("Tramo Llano: %.2f %.2f %n", consumoLlano, costeLlano );
            System.out.printf("Tramo Punta: %.2f %.2f %n", consumoPunta, costePunta );
            System.out.printf("Consumo total: %.2f%n", consumoTotal);
            System.out.printf("Coste total: %.2f%n", costeTotal);
            System.out.printf("Hora de consumo pico: %.2f %s:00", consumoPico, horaPico);
            
    }
}