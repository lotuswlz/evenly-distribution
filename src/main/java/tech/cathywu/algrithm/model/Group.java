package tech.cathywu.algrithm.model;

import java.util.List;

public class Group {

    private Long groupId;
    private List<Attr1> attr1s;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public List<Attr1> getAttr1s() {
        return attr1s;
    }

    public void setAttr1s(List<Attr1> attr1s) {
        this.attr1s = attr1s;
    }
}
