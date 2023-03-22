package HomeWorks;

public class HW_Strings {
    public static void main(String[] args) {
        String a = "Hello, Java! It's a Java Basic course";
        String a1 = new String("Hello, Java! It's a Java Basic course");

        System.out.println("String length is --" + a.length());
        System.out.println("New String a1 length is -- " + a1.length());
        System.out.println("Symbol ! -- " + a.charAt(11));
        System.out.println("Part itsajava -- " + a.substring(13,24));
        System.out.println("Part javabasiccourse -- " + a.substring(20));

    }
}
