package tech.cathywu.algrithm.solutionn1;

import tech.cathywu.algrithm.model.GroupConfig;

import java.util.HashMap;
import java.util.Map;

public final class DataPreparator {


    public static Map<Long, GroupConfig> prepareConfig() {
        Map<Long, GroupConfig> groupConfigs = new HashMap<>();
        groupConfigs.put(101L, new GroupConfig(101L, 2));
        groupConfigs.put(102L, new GroupConfig(102L, 3));
        groupConfigs.put(103L, new GroupConfig(103L, 4));
        groupConfigs.put(104L, new GroupConfig(104L, 6));
        groupConfigs.put(105L, new GroupConfig(105L, 2));
        return groupConfigs;
    }
}
