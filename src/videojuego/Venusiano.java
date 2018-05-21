package videojuego;
//David Morano Pérez
//21-06-2018
public class Venusiano extends Extraterrestre {

    private int cabezas;

    public Venusiano() {
        super(4, 4, "Verde");
        this.cabezas = 2;
    }

    public void atacarTerricola() {
        super.atacarTerricola();
        System.out.println("Experimentar con terrícola");
    }
}
