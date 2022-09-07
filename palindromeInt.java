import java.util.Scanner;

public class palindromeInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int r = 0;
        int temp = n;
        while(n>0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("It is  palindrome");
        }
        else{
            System.out.println("It is not a palindrom");
        }
    }
}
