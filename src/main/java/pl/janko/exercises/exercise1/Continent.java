package pl.janko.exercises.exercise1;


import java.util.List;

public class Continent {
        private String continentName;
        List<Country> countriesList;

    public Continent(String continentName, List<Country> countriesList) {
        this.continentName = continentName;
        this.countriesList = countriesList;
    }

    public List<Country> getCountriesList() {
        return countriesList;
    }
}
