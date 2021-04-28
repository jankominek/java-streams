package pl.janko.exercises.exercise1;

public class Country {

    private String continent;
    private String name;
    private Integer population;
    private Integer totalCases;
    private Integer totalDeaths;
    private Integer totalRecovered;
    private Integer activeCases;
    private Integer critical;
    private Integer totalCases1M;
    private Integer deaths1M;
    private Integer totalTests;
    private Integer tests1M;

    //constructor
    public Country(
            String continent,
            String name, Integer population,
            Integer totalCases, Integer totalDeaths,
            Integer totalRecovered, Integer activeCases,
            Integer critical, Integer totalCases1M, Integer deaths1M,
            Integer totalTests, Integer tests1M
    ) {
        this.continent = continent;
        this.name = name;
        this.population = population;
        this.totalCases = totalCases;
        this.totalDeaths = totalDeaths;
        this.totalRecovered = totalRecovered;
        this.activeCases = activeCases;
        this.critical = critical;
        this.totalCases1M = totalCases1M;
        this.deaths1M = deaths1M;
        this.totalTests = totalTests;
        this.tests1M = tests1M;
    }

    public String getContinent() {
        return continent;
    }

    public String getName() {
        return name;
    }

    public Integer getPopulation() {
        return population;
    }

    public Integer getTotalCases() {
        return totalCases;
    }

    public Integer getTotalDeaths() {
        return totalDeaths;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public Integer getActiveCases() {
        return activeCases;
    }

    public Integer getCritical() {
        return critical;
    }

    public Integer getTotalCases1M() {
        return totalCases1M;
    }

    public Integer getDeaths1M() {
        return deaths1M;
    }

    public Integer getTotalTests() {
        return totalTests;
    }

    public Integer getTests1M() {
        return tests1M;
    }


}
