package pl.janko.exercises.exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ModelExercise {


    public ModelExercise() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/Janek/IdeaProjects/own-projects/java-streams/worldometer_data.csv"));
        String line = "";
        while((line = bufferedReader.readLine()) != null){
            String[] row = line.split(",");
            System.out.println(row);
        }
        bufferedReader.close();
    }

}
