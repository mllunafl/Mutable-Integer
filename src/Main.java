public class Main {

    public static void main(String[] args) {
        Mutableinteger mutableinteger = new Mutableinteger(2);
        System.out.println(mutableinteger.byteValue());

        mutableinteger.setInt(8);
        System.out.println(mutableinteger.byteValue());
    }
}
