package pl.janko;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private String name;
    private List<Bar> bars = new ArrayList<>();

    public Foo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Bar> getBars() {
        return bars;
    }
}
