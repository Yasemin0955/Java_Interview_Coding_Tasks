package exercises;

import java.util.Arrays;
import java.util.TreeSet;

/*Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:*/
public class Same {
    public static void main(String[] args) {
        String str1="abc";
        String str2="cab";
        System.out.println(same(str1,str2));

    }
    public static boolean same(String str1, String str2){
        str1= new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        return str1.equals(str2);




}}
