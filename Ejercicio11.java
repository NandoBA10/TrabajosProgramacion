public class Ejercicio11 {
    public static void main(String[] args) {
        int[] listaNumeros = {3,5,7};
        int mostradosTabla3 = 0;
        int omitidosTabla3 = 0;
        int mostradosTabla5 = 0;
        int omitidosTabla5 = 0;
        System.out.println("==================================================");
        System.out.println("  TABLAS DE MULTIPLICAR CON FILTRO DE MÚLTIPLOS");
        System.out.println("  (Se omiten resultados múltiplos de 6)");
        System.out.println("==================================================");
        System.out.println("--- Tabla del 3 ---");
        for(int i = 0; i < listaNumeros.length;i++){
          for(int j = 0; j < 10 && i==0; j++){
            int tablaDel3 = (listaNumeros[i]) * j;
            if (tablaDel3 % 6 == 0) {
                omitidosTabla3++;
                continue;
            } else{
                mostradosTabla3++;
                System.out.printf("%d x %d = %d%n", listaNumeros[0], j, tablaDel3);
            }
            for(int k = 0; k < 10 && i == 1; k++){
                int tabladel5 = (listaNumeros[i]) * k;
                if (tabladel5 % 6 == 0) {
                    omitidosTabla5++;
                    continue;
                } else{
                    mostradosTabla5++;
                    System.out.printf("%d x %d = %d%n", listaNumeros[1], k, tabladel5);
                }
            }
            
          } 
           
        } 
        System.out.printf("Resumen tabla del %d: %d mostrados, %d omitidos", listaNumeros[0], mostradosTabla3, omitidosTabla3);
    }
}
