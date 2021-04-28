package pl.janko;

import pl.janko.exercises.exercise1.ModelExercise;

import java.io.IOException;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        FilterStream filter = new FilterStream();
        MapStream mapStream = new MapStream();
        Advanced advancedStreams = new Advanced();

        //filter.startWithLowercase();
        //filter.filterMethodWithRegex();
        //filter.filterWithTwoArguments();

        mapStream.toUpper();
        mapStream.getObjectValue();
        mapStream.getLengthOfStrings();

        advancedStreams.example1();
        advancedStreams.example2Sorting();
        advancedStreams.example3Peek();
        advancedStreams.mapToIntDoubleFunction();
        advancedStreams.parallelFunction();
        advancedStreams.reduceFunction();

        try {
            ModelExercise modelExercise = new ModelExercise();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //basicStream();
    }

    /*
    creating basic stream of Stream<> object - Stream<T> name = Stream.of(<T> elements);
     */
    private static void basicStream(){
        Stream<Integer> intStream = Stream.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        //contain stream() method coz it's a stream
        intStream.forEach(System.out::println);
    }
}
