package creation.singleton;

/**
 * Cette classe implemente un registre avec le patron de conception singleton
 * @author Abdou Khadre DIOP
 * @since 11/05/2016
 */
public class Registre {

    // le registre est static pour qui reste le meme quelque soit les objets
    // on le met en private pour l'encapsuler
    private static Registre instance =null;

    // le nom du registre
    private String nom;

    // l'adresse du registre
    private String adresse;

    // la taille en octet du registre
    private int taille;


    /**
     * on met le constructer en private pour que pesonne ne puisse y acceder a l'exterieur de la classe
     * seul notre méthode getInstance le pourra
     */
    private Registre(){
        super();
        this.nom=" mon registre";
        this.taille=64;
        this.adresse="@glk565z";
    }

    /**
     * Méthode permettant de renvoyer une instance de la classe Registe
     * Il est a notre que c'est la seule méthode qui le permet le constructeur etant en private
     * @return Retourne l'instance du Registre.
     */
    public final static Registre getInstance() {
        // vérifions si l'object static instance de la classe registre est null
        if (Registre.instance == null) {
            // empechons toute instanciation multiple meme via d'autres threads grace a synchronized
            synchronized(Registre.class) {
                if (Registre.instance == null) {
                    Registre.instance = new Registre();
                }
            }
        }
        return Registre.instance;
    }

    /**
     * Affiche les information en plus du hashcode de la classe d'accès
     */
    public void afficheInfos(){
        System.out.println("Les infos : ");
        System.out.println("- nom : "+this.nom);
        System.out.println("- adresse : "+this.adresse);
        System.out.println("- taille : "+this.taille);
        System.out.println("- hashcode : "+this.hashCode());
    }

    // quelques getter et setter

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

}
