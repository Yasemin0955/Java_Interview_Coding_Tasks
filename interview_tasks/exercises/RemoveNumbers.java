package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemoveNumbers {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>();
        Collections.addAll(nums, 99, 102, 130, 140);
        System.out.println("nums: "+nums);
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) {
            if(it.next()>100){
                it.remove();
            }
        }
        System.out.println(nums);
    }
}
