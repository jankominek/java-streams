package pl.janko;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        FilterStream filter = new FilterStream();
        filter.startWithLowercase();
        filter.filterMethodWithRegex();
        filter.filterWithTwoArguments();
        //basicStream();
    }
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 55),
            new Employee(2, "Bill Gates", 34),
            new Employee(3, "Mark Zuckerberg", 18)
    };

    /*
    creating basic stream of Stream<> object - Stream<T> name = Stream.of(<T> elements);
     */
    private static void basicStream(){
        Stream<Integer> intStream = Stream.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        //contain stream() method coz it's a stream
        intStream.forEach(System.out::println);
    }
}
