package OddEven;
import java.util.Scanner;
public class OddEven {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        
        if(input == 0){
            System.out.println("The number is zero");
        }
        else if(input % 2 == 0){
            System.out.println("Even number");
        }else {
            System.out.println("odd number");
        }

        if(input > 0){
            System.out.println("Positive number");
        }else {
            System.out.println("Negative number");
        }

    }
}