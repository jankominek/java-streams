package pl.janko.exercises.exercise1;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1Result{

    ModelExercise modelExercise;
    List<Temp> tempList = new ArrayList<>();

    public Exercise1Result() throws FileNotFoundException {
            this.modelExercise = new ModelExercise();
            //countries = modelExercise.getCountries();
    }

    public void res1(){

        Map<String, List<Integer>> m = new HashMap<>();
        m.put("a", Arrays.asList(1, 2, 3));
        m.put("b", Arrays.asList(1, 2, 3));
        m.put("c", Arrays.asList(1, 2, 3));
        m.put("d", Arrays.asList(1, 2, 3));
        m.put("e", Arrays.asList(1, 2, 3));
        //      Topic: Find the highest populated country of each continent:
        System.out.println("\nres1 -------------------------- \n");
        Map<String, Integer> res1 = new HashMap<>();
//        res1 = m.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.collectingAndThen(
//                Collectors.reducing(BinaryOperator.maxBy(Integer:))));
        //res1 = m.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Comparator.comparing(Map.Entry::getValue)));


    }

    private List<Temp> getTemplist(){
            List<Temp> list = Arrays.asList(
                    new Temp("a", 1),
                    new Temp("a", 2),
                    new Temp("b", 3),
                    new Temp("b", 4),
                    new Temp("c", 5),
                    new Temp("c", 6)
            );
            return list;
    }



}
