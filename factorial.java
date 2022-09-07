import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fact = n;
        for(int i = n-1; i>0;i--){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
