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

public class ModelExercise {

    Map<String, Country> countryMap = new TreeMap<>();
    String fileName = "/Users/Janek/IdeaProjects/own-projects/java-streams/worldometer_data.csv";

    public ModelExercise() throws FileNotFoundException {

        List<Country> beanList = new CsvToBeanBuilder(new FileReader(fileName))
                .withIgnoreLeadingWhiteSpace(true)
                .withType(Country.class).build().parse();

        for(Country c : beanList) System.out.println(c.toString());
    }

    public Set<String> createKeySet(List<Country> list) {

        Set<String> countrySet = new TreeSet<String>();

        return countrySet;
    }

    public void test(){

    }

}
