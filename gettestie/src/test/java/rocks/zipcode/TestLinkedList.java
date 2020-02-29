package rocks.zipcode;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;


public class TestLinkedList {

    LinkedList<Integer> link = new LinkedList<>();

    @Test
    public void TestAdd() {
        link.add(0, 10);
        link.add(1, 15);
        Assert.assertTrue(link.get(1) == 15);
    }

    @Test
    public void TestAddFirst() {
        link.add(0, 10);
        link.add(1, 20);
        link.addFirst(30);
        Assert.assertTrue(link.get(0) == 30);
    }

    @Test
    public void TestAddLast() {
        link.add(0, 10);
        link.add(1, 20);
        link.addLast(30);
        Assert.assertTrue(link.get(2) == 30);
    }

    @Test
    public void TestGetFirst() {
        link.add(0, 10);
        link.add(1, 20);
        link.addFirst(30);
        Assert.assertTrue(link.getFirst() == 30);
    }

    @Test
    public void TestGetLast() {
        link.add(0, 10);
        link.add(1, 20);
        link.addLast(30);
        Assert.assertTrue(link.getLast() == 30);
    }

    @Test
    public void TestPop(){
        link.add(0, 10);
        link.add(1, 20);
        link.addFirst(30);
        Assert.assertTrue(link.pop() == 30);
        Assert.assertTrue(link.pop() == 10);
        Assert.assertTrue(link.size() == 1);
    }

    @Test
    public void TestPeek(){
        link.add(0, 10);
        link.add(1, 20);
        link.addFirst(30);
        Assert.assertTrue(link.peek() == 30);
    }

}
