package tech.cathywu.algrithm.solutionn1;

import tech.cathywu.algrithm.model.Data;
import tech.cathywu.algrithm.model.GroupConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Analyzer {

    private Map<Long, GroupConfig> groupConfigs;

    public Analyzer() {
        groupConfigs = DataPreparator.prepareConfig();
    }

    public void process(List<Data> dataList) {

        Map<Long, List<Data>> groupByGroupId = dataList.stream().collect(Collectors.groupingBy(Data::getGroupId));
        List<Bucket<Long>> buckets = initBuckets(groupByGroupId);

        buckets.forEach(bucket -> {
            bucket.calculate();
        });
    }

    private List<Bucket<Long>> initBuckets(Map<Long, List<Data>> groupByGroupId) {
        List<Bucket<Long>> buckets = new ArrayList<>();
        groupByGroupId.forEach((g, d) -> {
            Bucket<Long> bucket = new GroupBucket(g, d, groupConfigs.get(g));
            buckets.add(bucket);
        });
        return buckets;
    }
}
