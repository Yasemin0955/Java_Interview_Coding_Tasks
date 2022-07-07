package exercises;

public class Palindrome {
    public static void main(String[] args) {
        String dummy = "";
        String str = "hey";
        for (int i = str.length() - 1; i >= 0; i--) {
            dummy = dummy + str.charAt(i);
        }
        if (str.equals(dummy)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }}
