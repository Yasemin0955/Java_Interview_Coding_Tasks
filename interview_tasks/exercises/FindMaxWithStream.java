package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxWithStream {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(76,34,90,100,20098);
        //Sorting in ascending order
        List<Integer> sortedNumbers=numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedNumbers = " + sortedNumbers);
        //max Value;
        System.out.println(sortedNumbers.get(sortedNumbers.size()-1));
    }
}
