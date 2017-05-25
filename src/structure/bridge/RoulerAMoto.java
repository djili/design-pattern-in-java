package structure.bridge;

/**
 * @autor Abdou Khadre DIOP
 * @since 25/05/2017.
 */
public class RoulerAMoto implements Chemin{

    private Virer virer;
    private String cote;
    public RoulerAMoto(Virer virer, String cote){
        this.virer=virer;
        this.cote=cote;
    }

    public void prendreVirage(){
        virer.bougerLeCorps(cote);
    }
}
