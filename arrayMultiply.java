public class arrayMultiply {
    public static void main(String[] args) {
        int[] arr = {1,-2,-3,5};
        int mul = 1 ;
        try{
            for(int i = 0; i< arr.length; i++){
                mul = arr[i]*mul;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("");
        }
       // System.out.println(mul);
        if(mul>0){
            System.out.println("1"); // return 1
        }
        else if(mul<0 ){
            System.out.println("-1"); // return -1
        }
        else if(mul==0){
            System.out.println("0"); // return 0
        }
    }
}
