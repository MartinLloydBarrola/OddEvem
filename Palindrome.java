public class Palindrome {

    public static void main(String[] args) {
        String word = "asa";
        StringBuilder sb = new StringBuilder(word);
        System.out.println((word.equals(sb.reverse().toString())) ? "Palin" : "Not Palin");
    }
}
