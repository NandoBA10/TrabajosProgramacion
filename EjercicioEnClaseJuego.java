import java.util.Arrays;
import java.util.Scanner;

public class EjercicioEnClaseJuego {
    public static void main(String[] args) {
        System.out.println("--- JUEGOS ---");
        System.out.println("1 - Tres en raya");

        System.out.println("Escribe el número del juego al que quieres jugar");

        Scanner sc = new Scanner(System.in);
        int numeroJuego = sc.nextInt();

        switch (numeroJuego) {
            case 1 -> jugarTresEnRaya(sc);
        }

    }

    public static void jugarTresEnRaya(Scanner sc) {
        char[][] tablero = new char[3][3];
        int[] coordenadas;

        

        //Mostrar el tablero
        mostrarTablero(tablero);

        //Pedir coordenadas
        coordenadas = pedirCoordenadas(sc);



    }

    /**
     * Muestra por pantalla el tablero del juego tres en raya.
     * @param tablero Un array bidimensional en los que se almacenan los chars de los jugadores del juego tres en raya.
     */
    public static void mostrarTablero(char[][] tablero) {
        for (char[] fila : tablero){
            System.out.println(Arrays.toString(fila));
        }
    }

    /**
     * Pide don números al usuario, correspondientes a las coordenadas en el tablero. Y devuelve un array de dos ints con esas coordenadas.
     * @param sc El scanner con el que leeremos por terminal.
     * @return Un array de int con dos elementos. El primero corresponde a la fila introducida por el usuario, el segundo corresponde a la columna 
     * introducida por el usuario.
     */
    public static int[] pedirCoordenadas(Scanner sc){
        int[] coordenadas = new int[2];
        System.out.println("¿En que fila lo quieres poner?");
        coordenadas[0] = sc.nextInt();
        System.out.println("¿En que columna lo quieres poner?");
        coordenadas[1] = sc.nextInt();

        return coordenadas;
    }

    /**
     * Completa un turno de 1 jugador en el juego tres en raya.
     * @param jugador El caracter que define cual es el jugador del turno.
     * @param tablero El tablero del juego.
     * @param sc La entrada de teclado en la que el jugador nos pone las coordenadas.
     */
    public static void jugarTurno(char jugador, char[][] tablero, Scanner sc) {
        System.out.println("Empieza el jugador " + jugador);

        //Mostrar el tablero
        mostrarTablero(tablero);

        //Pedir coordenadas
        int[] coordenadas = pedirCoordenadas(sc);

        //Poner la ficha del jugador 1
        tablero[coordenadas[0]][coordenadas[1]] = jugador;
    }


}
