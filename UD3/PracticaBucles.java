import java.util.Arrays;
import java.util.Random;

public class PracticaBucles {

    public static void main(String[] args) {

        // 1. Llamada a tus métodos propios
        int[] datos = generarDatos(10);
        System.out.println("Datos originales: " + Arrays.toString(datos));

        ordenar(datos);
        System.out.println("Datos ordenados:  " + Arrays.toString(datos));

        // 2. Sumatorio de mayores de 50
        int sumatorioMas50 = 0;
        for (int dato : datos) {
            if (dato > 50) {
                sumatorioMas50 += dato;
            }
        }
        System.out.println("Sumatorio > 50: " + sumatorioMas50);

        // 3. Multiplicar hasta que salga 66 (corregida la condición == 66)
        double productorio = 1;
        for (int dato : datos) {
            if (dato == 66) {
                break;
            }
            productorio *= dato;
        }
        System.out.println("Productorio antes de 66: " + productorio);

        // 4. Guardar números ascendentes en un nuevo array
        int max = 0;
        int lengthCrecientes = 0;
        for (int i = 0; i < datos.length; i++) {
            if (max < datos[i]) {
                max = datos[i];
                lengthCrecientes++;
            }
        }

        max = 0;
        int[] crecientes = new int[lengthCrecientes];
        int j = 0;
        for (int i = 0; i < datos.length; i++) {
            if (max < datos[i]) {
                max = datos[i];
                crecientes[j] = max;
                j++;
            }
        }
        System.out.println("Crecientes: " + Arrays.toString(crecientes));

        // 5. Matriz dentada rellena de asteriscos
        char[][] resultado = new char[datos.length][];
        for (int i = 0; i < datos.length; i++) {
            resultado[i] = new char[datos[i]];
            Arrays.fill(resultado[i], '*');
        }
        System.out.println("Matriz asteriscos: " + Arrays.deepToString(resultado));

        // 6. Suma de array fijo (corregido < en lugar de <= y += numeros[i])
        int[] numeros = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int sumaCompleta = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumaCompleta += numeros[i];
        }
        System.out.println("Suma completa: " + sumaCompleta);

        // 7. Bloque try-catch para división por cero
        int dividendo = 20;
        int divisor = 0;
        try {
            int resultado2 = dividendo / divisor;
            System.out.println("Resultado: " + resultado2);
        } catch (ArithmeticException e) {
            System.out.println("Aviso: no es posible dividir un número entero entre cero.");
        } finally {
            System.out.println("Bloque finally ejecutado siempre.");
        }
        System.out.println("Programa completado con éxito.");
    }

    /**
     * Genera un array de enteros aleatorios entre 1 y 10.
     *
     * @param cantidad Tamaño del array a generar.
     * @return Array relleno con números aleatorios.
     */
    public static int[] generarDatos(int cantidad) {
        Random rand = new Random();
        int[] nuevoArray = new int[cantidad];
        for (int i = 0; i < nuevoArray.length; i++) {
            nuevoArray[i] = rand.nextInt(1, 11);
        }
        return nuevoArray;
    }

    /**
     * Ordena de menor a mayor el array de enteros que recibe.
     *
     * @param numeros Array de ints a ordenar.
     */
    public static void ordenar(int[] numeros) {
        
        //--- Version A ---
        //Bucle (i) con una pasada por elemento 
        //En la pasada actual, encuentro el elemento menor entre las posiciones i y numero.length.
        // Lo coloco en la posición i, y el numero que habia ahi en la posicion original del menor encontrado.

        //--- Version B ---
        //Creo un array vacio (solucion) con la misma cantidad de elementos que numeros
        //Bucle (i) con una pasada por elemento
        //En cada pasada: encuentro el menor que sea mayor que anteriorMenor, lo copio en la posicion i de solucion y en la 
        //variable anteriorMenor
        //Escribo en numeros el valor de anteriorMenor

    }
}