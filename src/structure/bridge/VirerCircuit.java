package structure.bridge;

/**
 * @autor Abdou Khadre DIOP
 * @since 25/05/2017.
 */
public class VirerCircuit implements Virer {

    @Override
    public void bougerLeCorps(String cote) {
        System.out.println("Faire sorti son centre de graviter a l'exterieur de la moto du "+cote);
    }
}
