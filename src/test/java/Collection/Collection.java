package Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    @Test
    public void iterator(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
