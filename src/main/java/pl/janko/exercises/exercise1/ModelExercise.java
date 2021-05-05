package pl.janko.exercises.exercise1;

import com.google.gson.Gson;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModelExercise {

    public Map<String, List<Country>> continentsMap;
    String fileName = "C:\\Users\\Janek\\Desktop\\java-streams\\worldometer_data.csv";
    List<Continent> continents = new ArrayList<>();
    Gson gson = new Gson();
    String pathToData = "src/main/java/data/dataMap.json";

    public ModelExercise() throws FileNotFoundException {

        // import data from csv file to List of Countries
        System.out.println("\nModelExercise constructor --------------------");
        List<Country> countries = new CsvToBeanBuilder(new FileReader(fileName))
                .withIgnoreLeadingWhiteSpace(true)
                .withType(Country.class).build().parse();

        System.out.println("countries size -> " + countries.size());

        // creating Map ("continentName", Country) by grouping by
        continentsMap = countries.stream().collect(Collectors.groupingBy(f->f.getContinent()));

        //searching element with specific key and display it by stream
        for (Map.Entry<String, List<Country>> m : continentsMap.entrySet()){
            if(m.getKey().equals("North America")){
                System.out.println("size list of map -> " + m.getValue().size());

                m.getValue().stream().forEach( obj -> System.out.println(obj.getName()));
            }
        }
        //this.saveMainMaptoJson();

    }

    public Map<String, List<Country>> getContinentsMap() {
        return continentsMap;
    }

    private void saveMainMaptoJson(){

        String jsonFile = gson.toJson(continentsMap);
        try(FileWriter fileWriter = new FileWriter(pathToData)){
            fileWriter.write(jsonFile);
            fileWriter.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public <K, V> void removeNulls(Map<K, V> map)
    {
        System.out.println("map before ----> " + map.size());
        Iterator<Map.Entry<K, V>> itr = map.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<K, V> curr = itr.next();
            if (curr.getValue() == null) {
                itr.remove();
            }
        }
        System.out.println("map after ----> " + map.size());
    }
}
