package tech.cathywu.algrithm.solutionn1;

import tech.cathywu.algrithm.model.Attr1;
import tech.cathywu.algrithm.model.Data;
import tech.cathywu.algrithm.model.GroupConfig;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class Bucket<K> {
    private K key;
    private List<Data> dataList;
    private GroupConfig groupConfig;

    public Bucket(K key, List<Data> dataList, GroupConfig groupConfig) {
        this.key = key;
        this.dataList = dataList;
        this.groupConfig = groupConfig;
    }

    public abstract Function<Data, K> keyFunction();


    public void setData(List<Data> data) {
        dataList = data;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void calculate() {
        Map<String, List<Data>> attr1DataMap = dataList.stream().collect(Collectors.groupingBy(Data::getAttr1));
        List<Attr1> basicOptions = attr1DataMap.entrySet().stream().map(entry -> new Attr1(entry.getKey(), entry.getValue())).collect(Collectors.toList());

    }
}
