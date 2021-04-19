package pl.janko;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
    /*
    map() method is used for converting/changing values

     */
    public MapStream(){

    }

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
}
