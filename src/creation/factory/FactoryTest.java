package creation.factory;

/**
 * classe de test pour notre patron de conception Fabric
 * @author Abdou Khadre DIOP
 * @since 14/05/2016
 */
public class FactoryTest {

    public static void main(String args[]){
        PizzaFactory factory =  new PizzaFactory();
        try {
            Pizza italienne = factory.createPizza("italienne");
            Pizza senegalaise =  factory.createPizza("senegalaise");
            senegalaise.leGout();
            italienne.leGout();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
