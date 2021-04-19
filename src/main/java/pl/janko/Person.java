package pl.janko;

public class Person {

    private Integer id;
    private String name;
    private Integer age;
    private Genger gender;
    private Color favColor;

    public Person(Integer id, String name, Integer age, Genger gender, Color favColor) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.favColor = favColor;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Genger getGender() {
        return gender;
    }

    public Color getFavColor() {
        return favColor;
    }
}
