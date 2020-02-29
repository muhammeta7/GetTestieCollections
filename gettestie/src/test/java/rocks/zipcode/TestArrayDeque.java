package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;

public class TestArrayDeque {

    ArrayDeque<Integer> thing = new ArrayDeque<>();

    @Before
    public void beforeEach(){
        thing.clear();
    }

    public void TestContains(){
        thing.add(1);
        Assert.assertTrue(thing.contains(1));
    }

    @Test
    public void TestAddFirst(){
        thing.addFirst(1);
        thing.addFirst(2);
        Assert.assertTrue(thing.peekFirst().equals(2));
    }

    @Test
    public void TestAddLast(){
        thing.addLast(1);
        thing.addLast(2);
        Assert.assertTrue(thing.peekLast().equals(2));
    }

    @Test
    public void TestPollFirst() {
        thing.addFirst(1);
        thing.addFirst(2);
        Assert.assertTrue(thing.size() == 2);
        Assert.assertTrue(thing.pollFirst().equals(2));
        Assert.assertTrue(thing.size() == 1);
    }

    @Test
    public void TestPollLast() {
        thing.addLast(1);
        thing.addLast(2);
        Assert.assertTrue(thing.size() == 2);
        Assert.assertTrue(thing.pollLast().equals(2));
        Assert.assertTrue(thing.size() == 1);
    }

    @Test
    public void TestRemoveFirst() {
        thing.addFirst(1);
        thing.addFirst(2);
        Assert.assertTrue(thing.removeFirst() == 2);
        Assert.assertTrue(thing.size() == 1);
    }

    @Test
    public void TestRemoveLast() {
        thing.addLast(1);
        thing.addLast(2);
        Assert.assertTrue(thing.removeLast() == 2);
        Assert.assertTrue(thing.size() == 1);
    }

    @Test
    public void TestPop() {
        thing.addFirst(1);
        thing.addFirst(2);
        Assert.assertTrue(thing.pop().equals(2));
    }

    @Test
    public void TestPush() {
        thing.push(1);
        thing.push(2);
        Assert.assertTrue(thing.pop().equals(2));
    }

}
