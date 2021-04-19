package pl.janko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Advanced {

    List<Person> persons = new ArrayList<>();
    public Advanced(){
        persons = Arrays.asList(
            new Person(1, "James", 18, Genger.MALE, Color.BLACK),
            new Person(2, "Jimmy", 26, Genger.MALE, Color.GREEN),
            new Person(3, "Andrew", 36, Genger.MALE, Color.RED),
            new Person(4, "Julia", 23, Genger.FEMALE, Color.PINK),
            new Person(5, "Janet", 65, Genger.FEMALE, Color.YELLOW),
            new Person(6, "Cobe", 26, Genger.MALE, Color.BLACK),
            new Person(7, "Adrianna", 41, Genger.FEMALE, Color.GREEN),
            new Person(8, "Tom", 19, Genger.MALE, Color.YELLOW),
            new Person(9, "Caroline", 46, Genger.FEMALE, Color.PINK),
            new Person(10, "Artur", 27, Genger.MALE, Color.RED)
        );
    }

    /*
     example 1  :  get all names starts with "J" and "A", transform to capital and sort by name
     */
    public void example1(){
        Predicate<String> regex = Pattern.compile("^[J|j|A|a][a-zA-Z]*$").asPredicate();
            List<String> result = persons.stream().map(person -> (person.getName().toUpperCase())).filter(regex).sorted().collect(Collectors.toList());
            System.out.println(result);
    }

    public void example2Sorting(){
        System.out.println("-- example2Sorting --");
        Predicate<String> regex = Pattern.compile("^[CAT]").asPredicate();
        //sort reverse
        List<String> res1 = persons.stream().map(person -> person.getName().toLowerCase()).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(res1 + "     - map names and transform to lowercases and sort reverse");
        // Own Comparator
        // ADD CODE HERE <-----------------

    }

    public void example3Peek(){
        /*
            peek() is used for debugging each operation in the stream
         */
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("\n-- Peek func -- ");
        List<Integer> intResult = integerList.stream().map(i -> i+=3)
                .peek(p -> System.out.println("increment by 3  " + p))
                .sorted(Comparator.reverseOrder())
                .peek(p-> System.out.println("sorted integers :  " + p))
                .filter(i -> i>5).peek( p -> System.out.println("integers more than 5 : " + p))
                .collect(Collectors.toList());

        System.out.println(intResult.toString());
    }


    /*
        extra functions
     */


}
