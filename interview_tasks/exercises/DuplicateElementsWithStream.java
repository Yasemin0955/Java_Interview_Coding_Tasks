package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElementsWithStream {
    public static void main(String[] args) {
        //This is like for each loop
        List<Integer> number = Arrays.asList(2,3,4,5);
        //number.stream().map(x->x*x).forEach(y->System.out.println(y));
       // int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        //System.out.println("even = " + even);

        //distinct elements
       // Stream.of("Jai", "Mahesh", "Vishal", "Naren", "Hemant", "Naren", "Vishal")
             //   .distinct()
              //  .forEach(System.out::println);

        //My Task
        //How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> numbers=Arrays.asList(23,23,44,5,67,67,88,88);
        Set<Integer> duplicateNumbers=numbers.stream().filter(x-> Collections.frequency(numbers,x)>1)
                                                       .collect(Collectors.toSet());
        System.out.println("duplicateNumbers = " + duplicateNumbers);
    }
}
