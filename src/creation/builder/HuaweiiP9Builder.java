package creation.builder;

/**
 * @author Abdou Khadre DIOP
 * @since 14/05/2016
 */
public class HuaweiiP9Builder extends PhoneBuilder{

    @Override
    public void monterCarteMere() {
        phone.setCarteMere("Processeur (CPU)\t4x Cortex-A53 @ 1,80 GHz\n" +
                "4x Cortex-A72 @ 2,52 GHz\n" +
                "Puce Graphique (GPU)\tMali T-880 MP4\n" +
                "Mémoire vive (RAM)\t3 Go ou 4 Go\n" +
                "Mémoire interne (flash)\t32 Go ou 64 Go");
    }

    @Override
    public void monterEcran() {
        phone.setEcran("5.2 pouces ips full hd");
    }

    @Override
    public void monterBatterie() {
        phone.setBatterie(2800);
    }

    @Override
    public void testerTelephone() {
        phone.setTest("très bien tester a la sortie de l'usine");
    }
}
