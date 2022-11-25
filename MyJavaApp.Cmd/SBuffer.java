import java.util.Scanner;

public class SBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kimsiniz?");
        String input = scanner.nextLine();
        StringBuffer buffer = new StringBuffer();
        buffer.append(input);
        System.out.println(buffer);
        //input.length(); input.charAt(3); input.replace("h","k");
        //input.toLowerCase(); input.getBytes(); input.equalsIgnoreCase(buffer.toString());
    }
}
