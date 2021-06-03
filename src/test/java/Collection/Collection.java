package Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    @Test
    public void iterator(){
        /**
         * 迭代器演示
         */
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();
        // 判断下一个元素是否存在
        while (iterator.hasNext()){
            // 读取下一个
            String str = iterator.next();
            System.out.println(str);
        }
    }

    @Test
    public void iterator2(){
        /**
         * 迭代器演示：迭代过程删除元素
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if("B".equals(str)){
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    @Test
    public void foreach(){
        /**
         * foreach演示
         */
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        // 每次只取一个元素，直到取完为止
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void forEach(){
        /**
         * forEach演示
         */
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.forEach(str -> System.out.println("元素:" + str));
    }

    @Test
    public void forEachRemaining(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();
        iterator.forEachRemaining(str -> System.out.println("元素：" + str));
    }
}
