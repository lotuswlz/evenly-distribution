package tech.cathywu.algrithm.model;

import java.util.List;

public class Attr1 implements Comparable<Attr1> {

    private String value;
    private List<Data> data;
    private int score;

    public Attr1(String value, List<Data> data) {
        this.value = value;
        this.data = data;
    }

    public int getDataCount() {
        return this.data.size();
    }

    public String getValue() {
        return value;
    }

    public List<Data> getData() {
        return data;
    }

    @Override
    public int compareTo(Attr1 o) {
        return 0;
    }
}
