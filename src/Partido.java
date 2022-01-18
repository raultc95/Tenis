
public class Partido implements Runnable {
    private int marcadorJ1;
    private int marcadorJ2;
    private int setJ1;
    private int setJ2;
    private int sets;

    public Partido(int sets) {
        this.marcadorJ1 = 0;
        this.marcadorJ2 = 0;
        this.setJ1 = 0;
        this.setJ2 = 0;
        this.sets = sets;
    }

    @Override
    public void run() {
        Thread t1 = new Thread(new Raqueta());
        Thread t2 = new Thread(new Raqueta());
        do{
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

        } while (setJ1<sets || setJ2<sets);

        if(setJ1>=sets){
            System.out.println("Jugador 1 ha ganado");
        } else {
            System.out.println("Jugador 2 ha ganado");
        }



    }

    public int getMarcadorJ1() {
        return marcadorJ1;
    }

    public void setMarcadorJ1(int marcadorJ1) {
        this.marcadorJ1 = marcadorJ1;
    }

    public int getMarcadorJ2() {
        return marcadorJ2;
    }

    public void setMarcadorJ2(int marcadorJ2) {
        this.marcadorJ2 = marcadorJ2;
    }

    public int getSetJ1() {
        return setJ1;
    }

    public void setSetJ1(int setJ1) {
        this.setJ1 = setJ1;
    }

    public int getSetJ2() {
        return setJ2;
    }

    public void setSetJ2(int setJ2) {
        this.setJ2 = setJ2;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void empezar() {

    }
}
