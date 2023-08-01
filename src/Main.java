import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Attention! This program for Turkish Alphabet");
        System.out.println("Please enter a letter: ");

        Scanner enter = new Scanner(System.in);
        char letter = enter.next().charAt(0);

        char[] vowels = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü', 'A', 'E', 'I', 'İ', 'O', 'Ö', 'U', 'Ü'};

        for (int i = 0; i < 17; i++) {
            if (vowels[i] == letter) {
                System.out.println("This letter is vowel");
                break;
            } else {
                System.out.println("This letter is NOT vowel");
                break;
            }

        }


    }


}