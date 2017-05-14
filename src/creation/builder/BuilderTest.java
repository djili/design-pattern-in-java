package creation.builder;

/**
 * @author Abdou Khadre DIOP
 * @since 14/05/2016
 */
public class BuilderTest {

    public static void main(String args[]){

        System.out.println(" \n \n Notre lg g4 :\n\n");
        Foxconn usineLg=new Foxconn();
        usineLg.setPhoneBuilder(new LgG4Builder());
        usineLg.buildPhone();
        Phone lgG4=usineLg.getPhone();
        lgG4.description();

        System.out.println(" \n \n Notre huawei p9 :");
        Foxconn usineHuaweii=new Foxconn();
        usineHuaweii.setPhoneBuilder(new HuaweiiP9Builder());
        usineHuaweii.buildPhone();
        Phone p9=usineHuaweii.getPhone();
        p9.description();
    }

}
