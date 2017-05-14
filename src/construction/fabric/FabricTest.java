package construction.fabric;

/**
 * classe de test pour notre patron de conception Fabric
 * @author Abdou Khadre DIOP
 * @since 14/05/2016
 */
public class FabricTest {

    public static void main(String args[]){
        PizzaFabric fabrique =  new PizzaFabric();
        try {
            Pizza italienne = fabrique.createPizza("italienne");
            Pizza senegalaise =  fabrique.createPizza("senegalaise");
            senegalaise.leGout();
            italienne.leGout();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
