package tech.cathywu.algrithm.model;

import java.util.List;

public class Data implements Comparable<Data> {
    private long id;
    private Long groupId;
    private String attr1;
    private List<Long> attr2;
    private String attr3;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public List<Long> getAttr2() {
        return attr2;
    }

    public void setAttr2(List<Long> attr2) {
        this.attr2 = attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    @Override
    public int compareTo(Data o) {
        return Integer.compare(o.getAttr2().size(), this.getAttr2().size());
    }
}
