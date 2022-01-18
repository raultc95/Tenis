import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Competicion {
    private String nombre;

    public Competicion(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre del Jugador 1");
        String entrada = teclado.readLine();
        Jugador jugador1 = new Jugador(entrada);
        System.out.println("Ingrese el nombre del Jugador 2");
        entrada = teclado.readLine();
        Jugador jugador2 = new Jugador(entrada);
        System.out.println("¿Cuantos Sets?");
        int sets = teclado.read();

        Partido partido=new Partido(sets);
        
        partido.run();

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
