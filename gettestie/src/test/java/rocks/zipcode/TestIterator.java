package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestIterator {

    @Test
    public void TestIterator(){

        Set<String> mySet = new LinkedHashSet<>();
        mySet.add("Fish");
        mySet.add("Wish");
        mySet.add("Dish");

        ArrayList<String> myList = new ArrayList<>();
        Iterator<String> iterate = mySet.iterator();

        while(iterate.hasNext()){
            myList.add(iterate.next());
        }

        Assert.assertArrayEquals(mySet.toArray(), myList.toArray());

    }

    @Test
    public void TestRemoveIterator(){
        Set<String> mySet = new LinkedHashSet<>();
        mySet.add("Fish");
        mySet.add("Wish");
        mySet.add("Dish");

        Iterator<String> iterate = mySet.iterator();

        while(iterate.hasNext()){
            if(iterate.next().equals("Wish")){
                iterate.remove();
            }
        }

        Assert.assertFalse(mySet.contains("Wish"));

    }

}
