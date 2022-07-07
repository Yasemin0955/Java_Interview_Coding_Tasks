package exercises;

import java.util.Arrays;

public class AddTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};

        System.out.println(Arrays.toString( plusArrays(arr1,arr2)));

    }
    public static int[] plusArrays(int[] arr1, int[] arr2){
        int[] newArray=new int[arr1.length+arr2.length];
        for(int i=0 ; i<arr1.length; i++){
           newArray[i] =arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            newArray[arr1.length+i]=arr2[i];
        }

        return  newArray;
    }
}
