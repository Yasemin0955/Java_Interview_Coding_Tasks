package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        int[] arr={2,4,76,8,9};
      // List<Integer> arrayList=new ArrayList(Arrays.asList(arr));
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] < arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr2);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }


        }


    }

