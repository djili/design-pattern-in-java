package construction.fabric;

/**
 * Cette classe va permettre de creer d'autres construires d'autres objets
 * c'est notre builder
 * @author Abdou Khadre DIOP
 * @since 14/05/2016
 */
public class PizzaFabric {


    /**
     * Recuperer l'objet que l'on souhaite construire
     * @param type le type de pizza que l'on souhaite avoir
     * @return l'objet souhaiter
     * @throws Exception
     */
    public Pizza createPizza(String type) throws Exception {
        if (type.equals("italienne")) {
            return new PizzaItalienne();
        }else if (type.equals("senegalaise")) {
            return new PizzaSenegalaise();
        }else{
            throw new Exception("Impossible de creer cette pizza");
        }
    }

}
