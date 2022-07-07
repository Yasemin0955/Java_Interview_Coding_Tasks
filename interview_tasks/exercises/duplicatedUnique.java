package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicatedUnique {
    /*
               input: inteerrrviiew
               output:  ier
        create method return duplicated unique value
     */
    public static void main(String[] args) {

        System.out.println(test2("inteerrrviiew"));

    }
    public static String test2(String str){
        List<String> list = new ArrayList<>();
        String[] arr = str.split("");
        Arrays.stream(arr).distinct().forEach(a -> {if( Arrays.stream(arr).filter(b -> b.equals(a)).count()>1){ list.add(a);}
        });

        return list.toString();




    }

}