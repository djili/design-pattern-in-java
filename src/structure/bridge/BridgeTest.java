package structure.bridge;

/**
 * @autor Abdou Khadre DIOP
 * @since 25/05/2017.
 */
public class BridgeTest {

    public static void main(String args[]){
        Chemin[] rouler=new Chemin[4];
        rouler[0]=new RoulerAMoto(new VirerCircuit(),"gauche");
        rouler[1]=new RoulerAMoto(new VirerEnVille(),"droite");
        rouler[2]=new RoulerAMoto(new VirerEnVille(),"gauche");
        rouler[3]=new RoulerAMoto(new VirerCircuit(),"droite");

        for(Chemin roul : rouler){
            roul.prendreVirage();
        }

    }
}
