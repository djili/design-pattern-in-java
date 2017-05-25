package structure.bridge;

/**
 * @autor Abdou Khadre DIOP
 * @since 25/05/2017.
 */
public class VirerEnVille implements Virer{

    @Override
    public void bougerLeCorps(String cote) {
        System.out.println("Tourner la barre vers la "+cote);
    }
}
