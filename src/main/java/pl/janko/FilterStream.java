package pl.janko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class FilterStream {


    public FilterStream(){

    }

    /*
    Filter method
        - intermediate operation that allows filter elements of the stream
        - works with function or method reference

    Method reference  - shortcut for lambda expressions
     */

    public void startWithLowercase() {
        List<String> strArray = Arrays.asList("aas", "bbd", "aw", "gws", "waa", "fag", "qqq");
        //finding elements starts with "a" lowercase and adding result to new List
        List<String> str1 = strArray.stream().filter(element -> element.startsWith("a")).collect(Collectors.toList());
        System.out.println(str1);
        //with method reference
        List<String> str2 = strArray.stream().filter(FilterStream::hasALetterOnStart).collect(Collectors.toList());
        System.out.println(str2);
    }
    public void filterMethodWithRegex(){
        // using predicate
        List<String> strArray = Arrays.asList("aas", "bbd", "aw", "a2d", "34ff", "w2w");
        // |letter| |number| |letter|
        Predicate<String> regex = Pattern.compile("^[a-zA-Z][0-9][a-zA-Z]$").asPredicate();

        List<String> str1 = strArray.stream().filter(regex).collect(Collectors.toList());
        System.out.println(str1);
        // using lambda matches
        List<String> str2 = strArray.stream().filter( element -> element.matches("^[a-zA-Z][0-9][a-zA-Z]$")).collect(Collectors.toList());
        System.out.println(str2);
    }
    public void filterWithTwoArguments(){

//        List<Employee> employees1 = employees.stream().filter(employee -> employee.getName().startsWith("J") && employee.getAge() < 25).collect(Collectors.toList());
//        for(Employee emp : employees1){
//            System.out.println(emp.getId() + "  " + emp.getName() + "  " + emp.getAge());
//        }
    }





    /*
            Extra methods
     */

    private static boolean hasALetterOnStart(String s) {
        return s.startsWith("a");
    }
}
