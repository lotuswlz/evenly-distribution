package tech.cathywu.algrithm.solutionn1;

import tech.cathywu.algrithm.model.Data;
import tech.cathywu.algrithm.model.GroupConfig;

import java.util.List;
import java.util.function.Function;

public class GroupBucket extends Bucket<Long> {
    public GroupBucket(Long key, List<Data> dataList, GroupConfig groupConfig) {
        super(key, dataList, groupConfig);
    }

    @Override
    public Function<Data, Long> keyFunction() {
        return Data::getGroupId;
    }
}
