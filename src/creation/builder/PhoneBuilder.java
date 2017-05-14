package creation.builder;

/**
 * Created by diopo on 14/05/2017.
 */
public abstract class PhoneBuilder {

    protected Phone phone;

    public Phone getPhone(){
        return phone;
    }

    public void createPhone(){
        phone=new Phone();
    }

    public abstract void monterCarteMere();
    public abstract void monterEcran();
    public abstract void monterBatterie();
    public abstract void testerTelephone();

}
