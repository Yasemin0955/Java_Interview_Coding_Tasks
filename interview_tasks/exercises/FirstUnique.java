package exercises;

import java.util.*;

public class FirstUnique {
    public static void main(String[] args) {

        int[] A= new int[]{4,10,4,4,10,19};
        System.out.println(firstUnique(A)); ;
    }
    public static int firstUnique(int[] array){

        Map<Integer, Integer> map = new LinkedHashMap<>();
//        System.out.println(map.getClass());
//        System.out.println(map.getClass().getName());
//        System.out.println(map.getClass().getSimpleName());

        for (int each : array) {
            int frequency = 0;
            for (int s : array) {
                if(each==s){
                    frequency++;
                }}
            map.put(each, frequency);
        }
        for(int x:array){
        if(map.get(x)==1){
            return x;
        }
        }
        return -1;
    }}
