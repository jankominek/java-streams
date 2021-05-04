package pl.janko.exercises.exercise1;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModelExercise {

    Map<String, List<Country>> continentsMap = new TreeMap<>();
    String fileName = "C:\\Users\\Janek\\Desktop\\java-streams\\worldometer_data.csv";
    List<Continent> continents = new ArrayList<>();

    public ModelExercise() throws FileNotFoundException {

        // import data from csv file to List of Countries
        System.out.println("\nModelExercise constructor --------------------");
        List<Country> countries = new CsvToBeanBuilder(new FileReader(fileName))
                .withIgnoreLeadingWhiteSpace(true)
                .withType(Country.class).build().parse();

        System.out.println("countries size -> " + countries.size());

        // creating TreeMap ("continentName", Country) by grouping by
        continentsMap = countries.stream().collect(Collectors.groupingBy(f->f.getContinent()));

        //searching element with specific key and display it by stream
        for (Map.Entry<String, List<Country>> m : continentsMap.entrySet()){
            if(m.getKey().equals("North America")){
                System.out.println("size list of map -> " + m.getValue().size());

                m.getValue().stream().forEach( obj -> System.out.println(obj.getName()));
            }
        }
    }


}
