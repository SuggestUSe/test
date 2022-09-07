import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2);
        int n3 ;
        for(int i = 1;i<n; i++){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
