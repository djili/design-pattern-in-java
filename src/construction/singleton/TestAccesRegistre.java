package construction.singleton;

/**
 * Classe de test pour la classe registre
 * @author Abdou Khadre DIOP
 * @since 11/05/2016
 */
public class TestAccesRegistre {

    public static void main(String args[]){

        // on recupère l'instance de notre registre
        Registre reg1=Registre.getInstance();
        //on affiche les information
        reg1.afficheInfos();

        // modifions notre registre
        System.out.println(" Modifions notre registre ");
        reg1.setNom("registre modifier");
        reg1.setAdresse("@44f56g");
        reg1.setTaille(32);

        // on recupère notre registre
        Registre reg2=Registre.getInstance();
        //on affiche les information
        reg2.afficheInfos();

        // nous avons le meme hashcode il sagit de la meme instance de Registre
    }
}
