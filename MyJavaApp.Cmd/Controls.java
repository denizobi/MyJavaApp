import java.util.Date;
import java.util.Scanner;

public class Controls {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String grade = ""; int score;
        do {
            System.out.println("Lütfen Notunuzu Giriniz! (0-100)");
            score = scanner.nextInt(); //parola için nextLine()
        }
        while (score > 100); //while(parola.equals("mypass"));

            if (score >= 90 && score <= 100) {
                grade = "AA";
            } else if (score >= 85 && score < 90) {
                grade = "AB";
            } else if (score >= 80 && score < 85) {
                grade = "BB";
            } else if (score >= 75 && score < 80) {
                grade = "BA";
            } else if (score >= 70 && score < 75) {
                grade = "CC";
            } else if (score >= 65 && score < 70) {
                grade = "CB";
            } else if (score >= 60 && score < 65) {
                grade = "DC";
            } else if (score >= 55 && score < 60) {
                grade = "DD";
            } else if (score >= 50 && score < 55) {
                grade = "FD";
            } else if (score >= 0 && score <= 50) {
                grade = "FF";
            }
            System.out.println("Harf Notunuz: " + grade);

        System.out.println("-------------------");
        switch (score) {
            case 100:
            case 95: System.out.println("Mükemmel, Devam"); break;
            case 0:
            case 5: System.out.println("Çok Çalışmalısın!"); break;
            default: System.out.println("Okumak Güzeldir!");
        }

        while(true) { System.out.println(new Date()); Thread.sleep(1000); }

    }
}
