# 单列集合 - Collection
>单列集合的根接口，具有两个子接口List和Set接口。

+ List集合：元素有序、可重复。
  + 主要实现类：ArrayList和LinkedList
+ Set集合：元素无序、不可重复。
  + 主要实现类：HashSet和TreeSet

Collection接口所定义的方法：

| 方法名                            | 描述                                   |
| --------------------------------- | -------------------------------------- |
| boolean add(Object o)             | 添加一个元素                           |
| boolean addAll(Collection c)      | 把指定集合所有元素添加到集合中         |
| boolean remove(Object o)          | 删除指定元素                           |
| boolean removeAll(Collection c)   | 删除集合中包含指定集合的所有元素       |
| boolean isEmpty()                 | 判断集合是否为空                       |
| boolean contains(Object o)        | 判断集合中是否包含指定元素             |
| boolean containsAll(Collection c) | 判断集合中是否包含指定集合中的所有元素 |
| Iterator iterator()               | 返回在该集合上的元素上进行迭代的迭代器 |
| void clear()                      | 删除集合所有元素                       |
| int size()                        | 获取该集合元素个数                     |
| Stream<E> stream()                | 将集合源转为有序的流对象               |

## List接口

List接口继承Collection接口，List集合允许出现重复的元素，以线性方式进行存取，通过索引来访问元素。元素的存入顺序和取出顺序是一致的，所以List集合的元素是有序的。

List接口继承了Collection的所有方法，还增加了一些特有操作：

| 方法名                              | 描述                                    |
| ----------------------------------- | --------------------------------------- |
| void add(int index, Object element) | 将元素element插入到List集合指定索引位置 |
|                                     |                                         |

