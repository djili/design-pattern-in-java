package creation.prototype;

/**
 * @author Abdou Khadre DIOP
 * @since 14/05/2016
 */
public class Clone implements Cloneable{

    @Override
    protected Clone clone() {
        try {
            Clone clone=(Clone)super.clone();
            return clone;
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}
