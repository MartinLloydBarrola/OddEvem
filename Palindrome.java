import java.util.Scanner;;
public class Palindrome {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        StringBuilder string = new StringBuilder(word);
        System.out.println(string.reverse().toString().equalsIgnoreCase(word) ? "palindrome" : "not palindrome");
    }
}
