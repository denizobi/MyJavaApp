public class Statics {

    int ii = 200;
    static int i = 100;

    static {} //instance alınmadan çağrılır!

    public static void main(String[] args) {
        Statics statics = new Statics();
        System.out.println(statics.ii);
        System.out.println(i);
        System.out.println(Math.PI);
        Math.random(); Math.ceil(1.6); Math.floor(1.4);
        Math.round(1.6); Math.min(3,5); Math.max(3,5); Math.sqrt(4);

        //Enums ay = Enums.HAZIRAN; System.out.println(ay);
        Enums[] aylar = Enums.values();
        for (int j = 0; j < aylar.length; j++) {
            System.out.println(aylar[j]);
        }
    }
}
