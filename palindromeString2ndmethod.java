import java.util.Scanner;

public class palindromeString2ndmethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();
        String rev  = "";
        for(int i = original.length()-1; i>=0; i--){
            rev = rev+original.charAt(i);
        }
        if(rev.equals(original)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
