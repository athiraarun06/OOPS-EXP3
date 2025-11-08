import java.util.*;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String text = sc.nextLine();

        text = text.replaceAll(" ", ""); // remove spaces

        String vowelsList = "";
        String consonantsList = "";
        int vowelCount = 0, consonantCount = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowelsList += ch + ", ";
                    vowelCount++;
                } else {
                    consonantsList += ch + ", ";
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowels are: " + vowelsList + "Total = " + vowelCount);
        System.out.println("Consonants are: " + consonantsList + "Total = " + consonantCount);
    }
}
