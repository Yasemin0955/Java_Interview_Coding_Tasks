package exercises;

import java.util.Arrays;

public class CountTheWords {
    public static void main(String[] args) {
        String str="The string split() method breaks a given string around matches of the given regular expression. After " +
                "splitting against the given regular expression, this method returns a string array.";
        String [] stringArray=str.split(" ");
        System.out.println(Arrays.toString(stringArray));
        System.out.println(stringArray.length);
    }



}
