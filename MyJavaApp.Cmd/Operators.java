import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Operators {

    public static void main(String[] args) throws InterruptedException {
        int i = 10; //00000000 00000000 000000000 00001010
                    //11111111 11111111 111111111 11110101

        System.out.println(~i); //bitwise not operatörüdür
        System.out.println(i|i); //bitwise or operatörüdür
        System.out.println(i&i); //bitwise and operatörüdür
        System.out.println(i >> 1); //sağa shift sayı / 2'dir
        System.out.println(i << 1); //sola shift sayı * 2'dir

        // false & false = false
        // false & true = false
        // true & true = true
        // true & false = false

        // false | false = false
        // false | true = true
        // true | true = true
        // true | false = true

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: "); int age = scanner.nextInt();
        String mesaj = age >= 18 ? "Hmmm. Ehliyet Alabilirsin!" : "Üzgünüm ;( Biraz büyümelisin!";
        System.out.println(mesaj); // Burada kouşl operatörü kullanımı gösterilmiştir. one line code

        Scanner scannero = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: "); int sayo = scannero.nextInt();
        String mesajo = sayo % 2 == 0 ? "Hmmm. Girilen Sayı Çifttir!" : "Hmmm. Girilen Sayı Tektir!";
        System.out.println(mesajo); // Burada kouşl operatörü kullanımı gösterilmiştir. one line code

    }
}