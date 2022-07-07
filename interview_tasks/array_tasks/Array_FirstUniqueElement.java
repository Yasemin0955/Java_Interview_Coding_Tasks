package array_tasks;

public class Array_FirstUniqueElement {

    /*
    write a program that can find the first duplicated element from the array
     */
    public static void main(String[] args) {
        int [] A=new int[]{4,10,5,4,2,10};
        System.out.println(firstDuplicatedElement(A));
    }
    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }

        return firstDuplicated;

    }


}
