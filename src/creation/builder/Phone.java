package creation.builder;

/**
 * @author Abdou Khadre DIOP
 * @since 14/05/2016
 */
public class Phone {

    private String carteMere="";
    private String ecran="";
    private double batterie;
    private String test;

    public void setCarteMere(String carteMere) {
        this.carteMere = carteMere;
    }

    public void setEcran(String ecran) {
        this.ecran = ecran;
    }

    public void setBatterie(double batterie) {
        this.batterie = batterie;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public void description(){
        System.out.println("carte mere : "+this.carteMere);
        System.out.println("ecran : "+this.ecran);
        System.out.println("capacite de la batterie : "+this.batterie);
        System.out.println("qualite du produit : "+this.test);
    }
}
