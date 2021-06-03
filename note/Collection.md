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

**什么是数据流？**

## List接口

List接口继承Collection接口，List集合允许出现重复的元素，以线性方式进行存取，通过索引来访问元素。元素的存入顺序和取出顺序是一致的，所以List集合的元素是有序的。

List接口继承了Collection的所有方法，还增加了一些特有操作：

| 方法名                                     | 描述                                                         |
| ------------------------------------------ | ------------------------------------------------------------ |
| void add(int index, Object element)        | 将元素element插入到List集合指定索引位置                      |
| boolean addAll(int index, Collection c)    | 将集合c所包含的元素插入到List集合的指定索引位置              |
| Object get(int index)                      | 返回集合索引index处的元素                                    |
| Object remove(int index)                   | 删除index索引处的元素                                        |
| Object set(int indext, Object element)     | 将索引index处元素替换成element元素，并将替换后的元素返回     |
| int indexOf(Object o)                      | 返回对象o在List集合中首次出现的位置索引                      |
| int lastIndexOf(Object o)                  | 返回对象o在List集合中最后一次出现的位置索引                  |
| List subList(int fromIndex, int toIndex)   | 返回从索引fromIndex(包括)到toIndex(不包含)处所有元素集合组成的子集合 |
| Object[] toArray()                         | 将集合元素转换为数组                                         |
| default void sort(Comparator<? super E> c) | 根据指定的比较器规则对元素集合排序                           |

**什么是比较器？**

### ArrayList

ArrayList是List接口的一个**实现类**，ArrayList封装了一个长度可变的数组，存入元素超过数组长度时，ArrayList会自动变长。

ArrayList本质是一个数组，所以ArrayList的优缺点也非常明显：

+ 优点：
  + 通过索引快速定位元素。
  + 遍历和查找非常高效。

+ 缺点：
  + 增加或删除指定元素时效率低，不适合做大量的增删操作

ArrayList集合大部分方法是从Collection和List继承过来的。

```java
// 创建ArrayList集合
ArrayList list = new ArrayList();
```

### LinkedList

LinkedList解决了ArrayList增删元素效率低下的问题，其本质是一个**双向链表**，所以在执行增删操作时，会具有很高的效率，相反，在查找元素时，则会效率下降。

LinkedList继承了Collection和List接口中的方法，还额外增加了一些特有的操作。

| 方法名                         | 描述                         |
| ------------------------------ | ---------------------------- |
| void add(int index, E element) | 在列表中指定位置插入指定元素 |
| void addFirst(Object o)        | 将指定元素插入集合的开头     |
| void addLast(Object o)         | 将指定元素插入到集合尾部     |
| Object getFirst()              | 返回集合第一个元素           |
| Object getLast()               | 返回集合最后一个元素         |
| Object removeFirst()           | 删除并返回集合第一个元素     |
| Object removeLast()            | 删除并返回集合最后一个元素   |
| boolean offer(Object o)        | 将指定元素添加到集合的尾部   |
| boolean offerFirst(Object o)   | 将指定元素添加到集合开头     |
| boolean offerLast(Object o)    | 将指定元素添加到集合尾部     |
| Object peek()                  | 获取集合的第一个元素         |
| Object peekFirst()             | 获取集合的第一个元素         |
| Object peekLast()              | 获取集合的最后一个元素       |
| Object poll()                  | 删除并返回集合的第一个元素   |
| Object pollFirst()             | 删除并返回集合的第一个元素   |
| Object pollLast()              | 删除并返回集合的最后一个元素 |
| void push(Object o)            | 将指定元素添加到元素开头     |
| Object pop()                   | 删除并返回集合的第一个元素   |

## Collection集合遍历

### Iterator 迭代器

`Iterator`接口属于Java也属于Java集合框架的一员，但是不是用来存储数据的，而是用来迭代访问集合的。

通过调用集合对象的`iterator()`方法来创建集合的迭代器。迭代器的`next()`方法用来取出元素，遍历之前`next()`指向一个空对象，这样就保证了`next()`在第一次执行时指向第一个元素。使用`hasNxt()`方法来检查后面还是否有元素，所以`hasNxt()`来充当遍历循环条件。

