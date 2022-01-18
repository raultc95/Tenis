
public class Partido {
    private int marcadorJ1;
    private int marcadorJ2;
    private int setJ1;
    private int setJ2;
    private int sets;
    private static Partido partido;

    private Partido() {
        this.marcadorJ1 = 0;
        this.marcadorJ2 = 0;
        this.setJ1 = 0;
        this.setJ2 = 0;
    }

    public static Partido getPartido() {
        if (partido == null) {
            partido = new Partido();
        }

        return partido;
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

    @Override
    public String toString() {
        return "\t\tPartido{" +
                "marcadorJ1=" + marcadorJ1 +
                ", marcadorJ2=" + marcadorJ2 +
                ", setJ1=" + setJ1 +
                ", setJ2=" + setJ2 +
                ", sets=" + sets +
                '}';
    }

}
