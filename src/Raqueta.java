import java.util.Random;
import java.util.Scanner;
import java.util.stream.*;

public class Raqueta implements Runnable {

    private int accion;
    private Jugador jugador;

    public Raqueta() {
        accion = 1;
    }

    public int getAccion() {
        return accion;
    }

    public void setAccion(int accion) {
        this.accion = accion;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }


    @Override
    public void run() {
        Random rand = new Random();
        System.out.println(jugador + " Golpea");
        accion = rand.nextInt(3) + 1;
            switch (accion) {

                case 1:
                    System.out.println("Fuera, punto para " + jugador);
                    accion = 0;
                    break;
                case 2:
                    System.out.println("Falta, punto para " + jugador);
                    accion = 0;
                    break;
                case 3:
                    System.out.println("Punto limpio para " + jugador);
                    accion = 0;
                    break;
            }


    }
}



