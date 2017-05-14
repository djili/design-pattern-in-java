package construction.prototype;

/**
 * @author Abdou Khadre DIOP
 * @since 14/05/2016
 */
public class TestPrototype {
    public static void main(String args[])
    {
        Clone temp =  null;
        Clone bmw = new Bmw();
        Clone mercedes = new Mercedes();
        Usine usineMercedes = new Usine(mercedes);
        Usine usineBmw = new Usine(bmw);

        for (int i=0; i<20; i++)
        {
            temp = usineBmw.faireVoiture();
        }

        for (int i=0; i<20; i++)
        {
            temp = usineMercedes.faireVoiture();
        }

    }
}
