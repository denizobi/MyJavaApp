public class Stringim {

    public static void main(String[] args) {

        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        String s = new String(chars);
        //s.toUpperCase(); s.toLowerCase(); s.replace("o", "a"); s.charAt(1); ...
        String n = new String(chars, 0, 2);
        System.out.println(n);
    }
}
