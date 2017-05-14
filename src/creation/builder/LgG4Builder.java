package creation.builder;

/**
 * @author Abdou Khadre DIOP
 * @since 14/05/2016
 */
public class LgG4Builder extends PhoneBuilder{
    @Override
    public void monterCarteMere() {
        this.phone.setCarteMere("SoC\tSnapdragon 808\n" +
                "CPU\t2 coeurs A57 + 4 coeurs A53\n" +
                "GPU\tAdreno 418\n" +
                "Mémoire RAM\t3 Go\n" +
                "Mémoire interne\t32 Go");
    }

    @Override
    public void monterEcran() {
        this.phone.setEcran("Taille d'écran\t5,5 pouces\n" +
                "Technologie d'écran\tIPS (Quantum Dots)\n" +
                "Définition\t1440 x 2560 pixels\n" +
                "Résolution\t538 ppp");
    }

    @Override
    public void monterBatterie() {
        this.phone.setBatterie(3000);
    }

    @Override
    public void testerTelephone() {
        this.phone.setTest("trop de problemes de qualite produit chez lg");
    }
}
