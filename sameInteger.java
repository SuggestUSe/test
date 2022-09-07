public class sameInteger {
    public static void main(String[] args) {
        int[] arr = {3,2,-2,5,-3};
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == 3 && arr[arr.length-1] == -3){
                System.out.println("3"); // return 3
            }
            if(arr[i] == 1 && arr[arr.length-1] == -1){
                System.out.println("1");//return 1
            }
            else{
                System.out.println("0"); // return 0
            }
        }
    }
}
