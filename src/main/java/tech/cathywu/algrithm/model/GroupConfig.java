package tech.cathywu.algrithm.model;

public class GroupConfig {
    private Long groupId;
    private int requiredCount;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public int getRequiredCount() {
        return requiredCount;
    }

    public void setRequiredCount(int requiredCount) {
        this.requiredCount = requiredCount;
    }

    public GroupConfig(Long groupId, int requiredCount) {
        this.groupId = groupId;
        this.requiredCount = requiredCount;
    }
}
