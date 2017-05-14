package creation.builder;

/**
 * @author Abdou Khadre DIOP
 * @since 14/05/2016
 */
public class Foxconn {

    private PhoneBuilder phoneBuilder;

    public void setPhoneBuilder(PhoneBuilder phoneBuilder){
        this.phoneBuilder=phoneBuilder;
    }

    public Phone getPhone(){
        return phoneBuilder.getPhone();
    }

    public void buildPhone(){
        this.phoneBuilder.createPhone();
        this.phoneBuilder.monterBatterie();
        this.phoneBuilder.monterCarteMere();
        this.phoneBuilder.monterEcran();
        this.phoneBuilder.testerTelephone();
    }
}
