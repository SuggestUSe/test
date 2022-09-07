import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for(int i = 2; i<=10; i++ ){
            if(n%i==0){
                count++;
            }
        }
        if(count == 0){
            System.out.println(n+" is a Prime No");
        }
        else{
            System.out.println(n+" is not  prime no");
        }


    }
}
