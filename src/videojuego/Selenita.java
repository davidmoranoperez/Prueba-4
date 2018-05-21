package videojuego;

/**
 *
 * @author David Morano Pérez
 */
public class Selenita extends Extraterrestre implements DominarPlaneta {

    private String armamento;

    /**
     * Lanza el método atacar terricola de su clase padre
     */
    public void atacarTerricola() {
        super.atacarTerricola();
        System.out.println("Aniquilar terrícola");
        dispararArma();
    }

    /**
     * Muestra un mensaje con el ruido del arma
     */
    public void dispararArma() {
        if (armamento.equals("cañon láser")) {
            System.out.println("BOUMMM");
        } else {
            System.out.print("Bzzzzzz");
        }
    }

    /**
     * Llama a su clase padre para crear el armamento.
     * @param armamento
     */
    public Selenita(String armamento) {
        super(2, 1, "Azul");
        this.armamento = armamento;
    }

    /**
     *
     * @param armamento
     */
    public void asignarArmamento(String armamento) {
        this.armamento = armamento;
    }

    /**
     *
     * @param planeta
     */
    public void proclamarGobierno(String planeta) {
        System.out.println("Eliminar gobernantes del planeta:" + planeta);
        System.out.println("Gobernamos sobre el planeta " + planeta);
    }

    /**
     *
     * @param planeta
     */
    public void aniquilarPoblacion(String planeta) {
        System.out.println("Utilización de armas nucleares sobre el planeta " + planeta);
    }

    /**
     *
     * @param planeta
     */
    public void controlarRecursos(String planeta) {
    }
}
