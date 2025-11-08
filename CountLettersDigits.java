import java.util.Scanner;

public class CountLettersDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int letters = 0, digits = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch))
                letters++;
            else if (Character.isDigit(ch))
                digits++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
    }
}
