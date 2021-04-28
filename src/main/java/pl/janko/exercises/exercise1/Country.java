package pl.janko.exercises.exercise1;

import com.opencsv.bean.CsvBindByName;

public class Country {

    @CsvBindByName(column = "Country/Region")
    private String country;
    @CsvBindByName(column = "Continent")
    private String continent;
    @CsvBindByName(column = "Population")
    private Double population;
    @CsvBindByName(column = "TotalCases")
    private Double totalCases;
    @CsvBindByName(column = "TotalDeaths")
    private Double totalDeaths;
    @CsvBindByName(column = "TotalRecovered")
    private Double totalRecovered;
    @CsvBindByName(column = "ActiveCases")
    private Double activeCases;
    @CsvBindByName(column = "Serious,Critical")
    private Double critical;
    @CsvBindByName(column = "Tot Cases/1M pop")
    private Double totalCases1M;
    @CsvBindByName(column = "Deaths/1M pop")
    private Double deaths1M;
    @CsvBindByName(column = "TotalTests")
    private Double totalTests;
    @CsvBindByName(column = "Tests/1M pop")
    private Double tests1M;

    //constructor


    public String getContinent() {
        return continent;
    }

    public String getName() {
        return country;
    }

    public Double getPopulation() {
        return population;
    }

    public Double getTotalCases() {
        return totalCases;
    }

    public Double getTotalDeaths() {
        return totalDeaths;
    }

    public Double getTotalRecovered() {
        return totalRecovered;
    }

    public Double getActiveCases() {
        return activeCases;
    }

    public Double getCritical() {
        return critical;
    }

    public Double getTotalCases1M() {
        return totalCases1M;
    }

    public Double getDeaths1M() {
        return deaths1M;
    }

    public Double getTotalTests() {
        return totalTests;
    }

    public Double getTests1M() {
        return tests1M;
    }


    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                ", totalCases=" + totalCases +
                ", totalDeaths=" + totalDeaths +
                ", totalRecovered=" + totalRecovered +
                ", activeCases=" + activeCases +
                ", critical=" + critical +
                ", totalCases1M=" + totalCases1M +
                ", deaths1M=" + deaths1M +
                ", totalTests=" + totalTests +
                ", tests1M=" + tests1M +
                '}';
    }
}
