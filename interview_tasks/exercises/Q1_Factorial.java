package exercises;

public class Q1_Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(16));
    }
    //write a code to calculate n factorial
    public static int factorial(int n){
        int result=1;
        try{
            if (n<0) throw new Exception("n can not be negative");
            for(int i=1; i<=n; i++){
                result*= i;
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Please use a postive value");
            return -1;

        }
        return result;
    }
}
