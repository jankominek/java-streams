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

public class ModelExercise {

    Map<String, Country> countryMap = new TreeMap<>();
    String fileName = "C:\\Users\\Janek\\Desktop\\java-streams\\worldometer_data.csv";
    //List<Country> countries = new ArrayList<>();
    public ModelExercise() throws FileNotFoundException {

        List<Country> countries = new CsvToBeanBuilder(new FileReader(fileName))
                .withIgnoreLeadingWhiteSpace(true)
                .withType(Country.class).build().parse();


        countryMap = countries.stream().collect(Collectors.toMap(Country::getContinent, Function.identity(),
                (prevObj, newObj) -> prevObj, TreeMap::new));

        System.out.println(countryMap.toString());



    }

    public List<Country> addToList(List<Country> list, Country country) {

        list.add(country);

        return list;
    }

    private void createTreeMap(List<Country> list){

        //countryMap = list.stream().collect(Collectors.toMap(Country::getContinent, , (o1, o2) -> o1, TreeMap::new));


    }

    @Override
    public String toString() {
        return "ModelExercise{" +
                "countryMap=" + countryMap +
                '}';
    }
}
