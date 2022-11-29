import java.lang.reflect.Array;
import java.util.Arrays;

public class Drivers {
    public static void main(String[] args) {
        int[] numbers = new int[16];
        String[][] gunler = {{"1","2","3","4","5","6","7","8"}, {"P.tesi","Salı","Çrş.","Prş.","Cuma","C.tesi","Pazar","Sezar"}};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(gunler));
        //System.out.println(gunler[1][0]);
        Object[][] days = new Object[2][7];
        days[0][0] = 1; days[1][0] = "Pazartesi";
        days[0][1] = 2; days[1][1] = "Salı";
        days[0][2] = 3; days[1][2] = "Çarşamba";
        days[0][3] = 4; days[1][3] = "Perşembe";
        days[0][4] = 5; days[1][4] = "Cuma";
        days[0][5] = 6; days[1][5] = "Cumartesi";
        days[0][6] = 7; days[1][6] = "Pazar";
        System.out.println(Arrays.toString(days));

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                if (i < 1) {
                    System.out.println("Haftanın " + days[i][j] + "." + " günü " + days[i + 1][j]);
                }
            }
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < gunler[i].length; j++) {
                System.out.println("Haftanın " + gunler[i][j] + "." + " günü " + gunler[i+1][j]);
            }
        }
        /*String[] guns = new String[gunler.length];
        for (int i = 0; i < gunler.length; i++) {
            guns[i] = gunler[i];
        }*/
        //referans tipi değişkenler bellek adresindeki değerleri tutar.
        //bu nedenle referasn tipe atanmış bir değişken bundan etkilenir.
        //System.out.println(Arrays.toString(guns));
    }
}
