package creation.prototype;

/**
 * @author Abdou Khadre DIOP
 * @since 14/05/2016
 */
public class Usine {

    private Clone voiture;

    public Usine(Clone voiture)
    {
        this.voiture = voiture;
    }

    public Clone faireVoiture()
    {
        return voiture.clone();
    }

}
