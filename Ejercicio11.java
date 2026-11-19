public class Ejercicio11 {
    public static void main(String[] args) {
        int[] listaNumeros = {3,5,7};
       
        System.out.println("==================================================");
        System.out.println("  TABLAS DE MULTIPLICAR CON FILTRO DE MÚLTIPLOS");
        System.out.println("  (Se omiten resultados múltiplos de 6)");
        System.out.println("==================================================");
        for(int numero : listaNumeros){
             int mostrados = 0;
             int omitidos = 0;
            System.out.printf("--- Tabla del %d ---%n", numero);
          for(int j = 1; j <= 10; j++){
            int tablaDeMultiplicar = numero * j;
            if (tablaDeMultiplicar % 6 == 0) {
                omitidos++;
                continue;
            }
            mostrados++;
           System.out.printf("%d x %d = %d%n", numero, j, tablaDeMultiplicar);
        
            
          } 
        System.out.printf("Resumen tabla del %d: %d mostrados, %d omitidos%n",numero, mostrados, omitidos);    }
}
}
