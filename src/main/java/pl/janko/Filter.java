package pl.janko;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    private List<Employee> list;

    public Filter(List<Employee> list) {
        this.list = list;
    }

    public List<Employee> getList() {
        return list;
    }

    // using filter and Collectors
    public void filterByMoreThen(int value){
        list.stream().filter(f -> f.getAge() > value).forEach(f -> System.out.println(f.getFname() +"  "+ f.getLname()));
    }
    public void filterByName(){

    }

}
