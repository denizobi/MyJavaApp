import java.util.Arrays;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Oyuna Kaç Kişi Dahil Edilecek? ");
        String[] names = new String[Integer.parseInt(scanner.nextLine())];

        for (int i = 0; i < names.length; i++) {
            System.out.print(i+1+".Kişi: ");
            names[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(names));

        for (String s: names) {
            System.out.print(s);
        }
    }
}
