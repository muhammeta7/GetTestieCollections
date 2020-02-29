package rocks.zipcode;

import org.junit.Before;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    Stack<String> stack = new Stack<>();

    @Before
    public void beforeEach(){
        stack.clear();
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @org.junit.Test
    public void TestStackPush() {
        stack.push("Hey");
        assertEquals(false, stack.isEmpty());
    }

    @org.junit.Test
    public void TestStackPop() {
        stack.push("Hey");
        stack.push("Yo");
        assertEquals("Yo", stack.pop());
    }

    @org.junit.Test
    public void TestStackPeek() {
        stack.push("Sup");
        assertEquals("Sup", stack.peek());
    }

}
