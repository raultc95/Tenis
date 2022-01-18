import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Competicion {
    private String nombre;

    public Competicion(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Jugador 1");
        String entrada = teclado.nextLine();
        Jugador jugador1 = Jugador.getJugador1();
        jugador1.setNombre(entrada);

        System.out.println("Ingrese el nombre del Jugador 2");
        entrada = teclado.nextLine();
        Jugador jugador2 = Jugador.getJugador2();
        jugador2.setNombre(entrada);

        System.out.println("¿Cuantos Sets?");
        int sets = teclado.nextInt();
        Partido partido = Partido.getPartido();
        partido.setSets(sets);

        Competicion.run();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void run() {
        Thread t1 = new Thread(new Raqueta());
        Thread t2 = new Thread(new Raqueta());

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        t2.start();

        try {
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

}
