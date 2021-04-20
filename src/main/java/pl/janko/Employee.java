package pl.janko;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

    private Integer id;
    private Date dateAdded = new Date();
    private String fname;
    private String lname;
    private Integer age;
    private Integer earnings;
    private Date employedAt;

    public Employee(Integer id, String fname, String lname, Integer age, Integer earnings, String employedAt) throws ParseException {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.earnings = earnings;
        this.employedAt = simpleDateFormat.parse(employedAt);
    }

    public Integer getId() {
        return id;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getEarnings() {
        return earnings;
    }

    public Date getEmployedAt() {
        return employedAt;
    }
}
