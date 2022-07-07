package exercises;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(15));

    }
    public static boolean isPrime(int num){
        boolean flag=true;
        if(num==0 || num==1){
            flag=false;
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
}
