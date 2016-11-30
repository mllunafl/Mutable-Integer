/**
 * Created by LunaFlores on 11/30/16.
 */
public class Mutableinteger {
    private Integer num;

    public Mutableinteger(int value){
        num= new Integer(value);
    }

    public void setInt(int value){
        num = new Integer(value);
    }

    public byte byteValue(){
        return num.byteValue();
    }

    public double doubleValue(){
        return num.doubleValue();
    }

    public float floatValue(){
        return num.floatValue();
    }

    public int hashCode(){
        return num.hashCode();
    }

    public int intValue(){
        return num.intValue();
    }

    public long longValue(){
        return num.longValue();
    }

    public short shortValue(){
        return num.shortValue();
    }

    public String tostring(){
        return num.toString();
    }

}
