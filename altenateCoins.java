import java.util.function.DoubleToIntFunction;

public class altenateCoins {
    public static void main(String[] args) {
        int[] arr = { 1, 1,0, 1,1};

        try{
            for(int i = 0; i<= arr.length; i++){
                if(arr[i] == 1 && arr[i+1] == 0){
                    System.out.println("1");
                }
                else if(arr[i] == 1 && arr[i+1] == 1){
                    System.out.println("2");
                }
                else if(arr[i] == 0 && arr[i+1] == 1){
                    System.out.println("0");
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("");
        }

    }
}
