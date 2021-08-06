public class TestTask {
    public static void main(String[] args) {
        byte b = Byte.MAX_VALUE;
        short sh = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        long l = Long.MAX_VALUE;
        double d = Double.MAX_VALUE;
        char ch = Character.MAX_VALUE;

        System.out.println("The byte data: " +getData(b));
        System.out.println("The short data: " +getData(sh));
        System.out.println("The int data: " +getData(i));
        System.out.println("The long data: " +getData(l));
        System.out.println("The double data: " +getData(d));
        System.out.println("The char data: " +getData(ch));


    }

    public static <T> T getData(Object obj){
        return (T) obj;
    }
}
