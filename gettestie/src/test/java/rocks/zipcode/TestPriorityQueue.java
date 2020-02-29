package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue {

    PriorityQueue<Integer> que = new PriorityQueue<>();

    @Before
    public void beforeEach(){
        que.clear();
    }

    @Test
    public void TestAdd() {
        que.add(1);
        Assert.assertTrue(que.contains(1));
    }

    @Test
    public void TestPeek() {
        que.add(1);
        que.add(2);
        Assert.assertTrue(que.peek() == 1);
        Assert.assertTrue(que.size() == 2);
    }

    @Test
    public void TestPoll() {
        que.add(1);
        que.add(2);
        que.add(3);
        Assert.assertTrue(que.poll() == 1);
        Assert.assertTrue(que.size() == 2);
    }

}
