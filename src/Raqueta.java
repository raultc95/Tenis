import java.util.Random;
import java.util.Scanner;
import java.util.stream.*;

public class Raqueta implements Runnable {
    private int accion;
    private Jugador jugador;
    public static boolean esJugador1 = true;

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
        Partido partido = Partido.getPartido();
        Jugador jugador;

        while (partido.getSetJ1() < partido.getSets() && partido.getSetJ2() < partido.getSets()) {
            jugador = esJugador1 ? Jugador.getJugador1() : Jugador.getJugador2();

            Random rand = new Random();
            System.out.println(jugador.getNombre() + " Golpea");
            accion = rand.nextInt(3) + 1;

            switch (accion) {
                case 1:
                    jugador = !esJugador1 ? Jugador.getJugador1() : Jugador.getJugador2();
                    System.out.println("Fuera, punto para " + jugador.getNombre());

                    if (!esJugador1)
                        partido.setMarcadorJ1(partido.getMarcadorJ1() + 1);
                    else
                        partido.setMarcadorJ2(partido.getMarcadorJ2() + 1);
                    break;
                case 2:
                    jugador = !esJugador1 ? Jugador.getJugador1() : Jugador.getJugador2();
                    System.out.println("Falta, punto para " + jugador.getNombre());

                    if (!esJugador1)
                        partido.setMarcadorJ1(partido.getMarcadorJ1() + 1);
                    else
                        partido.setMarcadorJ2(partido.getMarcadorJ2() + 1);
                    break;
                case 3:
                    jugador = esJugador1 ? Jugador.getJugador1() : Jugador.getJugador2();
                    System.out.println("Punto limpio para " + jugador.getNombre());

                    if (esJugador1)
                        partido.setMarcadorJ1(partido.getMarcadorJ1() + 1);
                    else
                        partido.setMarcadorJ2(partido.getMarcadorJ2() + 1);
                    break;
            }
            esJugador1 = !esJugador1;

            if (partido.getMarcadorJ1() > 4) {
                partido.setSetJ1(partido.getSetJ1()+1);
                partido.setMarcadorJ1(0);
                partido.setMarcadorJ2(0);
            }
            if (partido.getMarcadorJ2() > 4) {
                partido.setSetJ2(partido.getSetJ2()+1);
                partido.setMarcadorJ1(0);
                partido.setMarcadorJ2(0);
            }
            System.out.println(partido.toString());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (partido.getSetJ1() >= partido.getSets()) {
            jugador = esJugador1 ? Jugador.getJugador1() : Jugador.getJugador2();
            System.out.println("El jugador " + jugador.getNombre() + " ha ganado");
        } else {
            jugador = !esJugador1 ? Jugador.getJugador1() : Jugador.getJugador2();
            System.out.println("El jugador " + jugador.getNombre() + " ha ganado");
        }
    }
}



