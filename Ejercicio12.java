public class Ejercicio12 {
 public static void main(String[] args) {
    double[] temperaturas = {24.5, 28.0, -5.0, 31.2, 85.4, 92.1, -12.3, 45.0, 81.0, 29.8, -999.0, 50.0};
    int lecturasProcesadas = 0;
    int lecturasDeRuido = 0;
    int alertaUmbralCritico = 0;
     double totalTemperaturas = 0;
    double temperaturaMaxima = 0;
    double temperaturaMinima = 1000;

    System.out.println("Iniciando monitorización de telemetría...");
    for(int i = 0; i < temperaturas.length; i ++){
        
        if(temperaturas[i] == -999.0){
            break;
        } else if (temperaturas[i] < 0){
            System.out.printf("[AVISO] Ruido detectado (%.1f). Lectura descartada%n", temperaturas[i]);
            lecturasDeRuido++;
            continue;
        } else if(temperaturas[i] >= 80.0){
            System.out.printf("[ALERTA] Valor critico detectado: %.1f%n", temperaturas[i]);
            alertaUmbralCritico++;
        }
        lecturasProcesadas++;
        if (temperaturas[i] > temperaturaMaxima){
            temperaturaMaxima = temperaturas[i];
        }
        if (temperaturas[i] < temperaturaMinima){
            temperaturaMinima = temperaturas[i];
        }
        totalTemperaturas += temperaturas[i];}
        double mediaTemperatura = totalTemperaturas / temperaturas.length;


    System.out.println("Centinela de parada alcanzado. Procesamiento finalizado.");

    System.out.printf("========================================== %n");
    System.out.println("      INFORME DE TELEMETRÍA FINAL");
    System.out.printf("========================================== %n");
    System.out.printf("Lecturas procesadas válidas: %d%n", lecturasProcesadas);
    System.out.printf("Lecturas de ruido descartadas: %d%n", lecturasDeRuido);
    System.out.printf("Alertas por umbral crítico (>= 80.0): %d%n", alertaUmbralCritico);
    System.out.printf("Temperatura media: %.2f %n", mediaTemperatura);
    System.out.printf("Temperatura máxima: %.2f %n", temperaturaMaxima);
    System.out.printf("Temperatura mínima: %.2f %n", temperaturaMinima);
}
}
