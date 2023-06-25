# Solution 1
> 遍历所有的可能性<br/>但是切分可能性的方式尽量整齐；且，替换读取的方式尽量抽象，例如同样拥有一个country的data，类似情况的owner，都可以作为备选条件

# Solution 2
> 设计新的数据结构，group与attr1的mapping，attr1与数据的mapping，以及数据与attr2 (multiple value)的mapping，可以快速通过上下节点定位某一层的数据