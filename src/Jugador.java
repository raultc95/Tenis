public class Jugador {

    private String nombre;
    private Raqueta raqueta;
    private static Jugador jugador1;
    private static Jugador jugador2;

    private Jugador() {
    }

    public static Jugador getJugador1() {
        if (jugador1 == null) {
            jugador1 = new Jugador();
        }

        return jugador1;
    }

    public static Jugador getJugador2() {
        if (jugador2 == null) {
            jugador2 = new Jugador();
        }

        return jugador2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raqueta getRaqueta() {
        return raqueta;
    }

    public void setRaqueta(Raqueta raqueta) {
        this.raqueta = raqueta;
    }

}
