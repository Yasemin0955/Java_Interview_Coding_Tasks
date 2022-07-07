package exercises;

import java.util.HashMap;
import java.util.Map;


public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;

        int num1 = 0;
        int num2 = 0;

        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == sum){
                    pairs.put(arr[i], arr[j]);
                }
            }
        }

        System.out.println(pairs);


    }
    }
