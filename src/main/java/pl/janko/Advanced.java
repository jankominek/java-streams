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


    public void mapToIntDoubleFunction(){
        System.out.println("\n mapToIntDoubleFunction --------");
    /*
    MapToInt works similary to map(String::length) - return intStream [ intermediate operation ]
     */

        List<String> str = Arrays.asList("aaa", "bbbb", "ccccc", "dddddd");
        List<Integer> intMap = new ArrayList<>();
        List<Double> doubleMap = new ArrayList<>();
        // mapToInt, mapToDouble, mapToLong doesn't work with collectors.. so if we want to have result in other list we need to put it manually
        // like in this example
        str.stream().mapToInt( i -> i.length()).forEach(intMap::add);
        System.out.println("intMap :  " + intMap);
        // mapToDouble example (simillary)
        str.stream().mapToDouble( i -> i.length()).forEach(doubleMap::add);
        System.out.println("doubleMap :  " + doubleMap);

    /*
                            another example/tip !!
        we can use boxed() method to solve this problem
        boxed() method return stream of each element which is boxed to Integer

     */
        System.out.println("solved problem !");
        List<Integer> solved = str.stream().mapToInt(i -> i.length()).boxed().collect(Collectors.toList());
        System.out.println("Boxed list -> " + solved);
    }
    public void reduceFunction(){
        /*
               reduction stream operations allow us to produce one single result from a sequence of elements
                    § identity - initial value if stream is empty
                    § accumulator - function with two arguments of the reduction operation
                    § Combiner - used for combine results of substreams / example / when we use different types in reduce function

         */
        System.out.println("\nreduceFunction ------ \n");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(intList);
        //sum all elements of list without Combiner
        Integer res1 = intList.stream().reduce(0, (x, y) -> x + y);
        System.out.println("result of sum -> " + res1);
        // the same with method reference
        Integer res2 = intList.stream().reduce(0, Integer::sum);
        System.out.println("result of sum with method reference -> " + res2);

        // connected strings

        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println(stringList);
        String resStr1 = stringList.stream().reduce("", (x, y) -> x+y);
        System.out.println("concat strings with reduce -> " + resStr1);

        // Combiner
        // explanaition : https://stackoverflow.com/questions/24308146/why-is-a-combiner-needed-for-reduce-method-that-converts-type-in-java-8
        System.out.println("\nusing accumulatr String -> sum of String.length");

        List<String> stringList2 = Arrays.asList("aaa", "bbbb", "ccccc");
        System.out.println(stringList2);
        Integer intListRes = stringList2.stream().reduce(0, (accuX,y)->accuX + y.length(), (accuX, accuZ) -> accuX + accuZ);
        System.out.println("intListRes -> " + intListRes);

    }
    public void parallelFunction(){
        /*
                .parallel() is used to making parallel stream ( not sequential ) for better performance

                example :
         */
        //Stream intStream = Stream.of(1, 2, 3, 4, 5, 6);
        System.out.println("\nParallelFuntion ---- \n");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("integers -> " + integers);
        List<Integer> intList = integers.parallelStream().collect(Collectors.toList());
        System.out.println("intList -> " + intList);
        //print in random order dependently from threads
        integers.parallelStream().forEach(System.out::println);
    }



    /*
        extra functions
     */


}
