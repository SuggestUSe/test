import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();;
        String rev = new StringBuilder(original).reverse().toString();
        System.out.println(rev);
        if(rev.equals(original)){
            System.out.println("It is  palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
