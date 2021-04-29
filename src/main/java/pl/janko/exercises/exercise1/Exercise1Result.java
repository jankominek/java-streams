package pl.janko.exercises.exercise1;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Stream;

public class Exercise1Result {

    List<Country> countries = new ArrayList<>();
    List<Temp> tempList = new ArrayList<>();

    public Exercise1Result() throws FileNotFoundException {
            ModelExercise modelExercise = new ModelExercise();
            //countries = modelExercise.getCountries();
    }

    public void res1(){
        //      Topic: Find the highest populated country of each continent:
        System.out.println("\nres1 -------------------------- \n");
        Map<String, Integer> res1 = new HashMap<>();
        tempList = this.getTemplist();

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
