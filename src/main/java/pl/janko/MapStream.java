package pl.janko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
    /*
    map() method is used for converting/changing/transform values and is applied for each element

     */

    List<Employee> employees = new ArrayList<>();

    public MapStream(){
        employees = Arrays.asList(
                new Employee(1, "Jeff Bezos", 55),
                new Employee(2, "Bill Gates", 34),
                new Employee(3, "Mark Zuckerberg", 18),
                new Employee(4, "Jimmy Rose", 39),
                new Employee(5, "Anrew Mile", 17)
        );
    }
    //basic operation
    public void toUpper(){
        List<String> strList = Arrays.asList("aa", "bb", "cc", "dd", "ee", "ff");
        System.out.println("-- initial list --");
        System.out.println(strList + "\n");
        //using lambda expression
        List<String> strRes1 = strList.stream().map( element -> element.toUpperCase()).collect(Collectors.toList());
        System.out.println(strRes1);
        //using built-in method reference
        List<String> strRes2 = strList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(strRes2);
    }

    //function based on get values of object by map() method
    public void getObjectValue(){                                       //map 2 var
        //lambda
        List<String> strRes1 = employees.stream().map(value -> value.getName()).collect(Collectors.toList());
        System.out.println(strRes1);

        List<String> strRes2 = employees.stream().map(Employee::getName).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(strRes2);
    }
}
