package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeSet;

public class TestTreeSet {

    TreeSet<String> tree = new TreeSet<>();

    @Before
    public void beforeEach() {
        tree.clear();
    }

    @Test
    public void TestSize(){
        tree.add("1");
        tree.add("2");
        tree.add("1");
        tree.add("3");
        tree.add("4");

        Integer expected = 4;
        Integer actual = tree.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestContains(){
        tree.add("1");
        Assert.assertTrue(tree.contains("1"));
        Assert.assertFalse(tree.contains("2"));
    }

    @Test
    public void TestRemove(){
        tree.add("1");
        tree.remove("1");
        Assert.assertTrue(tree.isEmpty());
    }
}
