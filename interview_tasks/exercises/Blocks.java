package exercises;

public class Blocks {
    static {System.out.println("static block");}
    {
        System.out.println("true = " + true);
    }

    public static void main(String[] args) {
        System.out.println("main block");
    }


}
