package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class TestTreeMap {

    HashMap<Integer, String> map = new HashMap<>();

    @Before
    public void beforeEach(){
        map.clear();
    }

    @Test
    public void TestGet() {
        map.put(1, "Moe");
        Assert.assertTrue(map.get(1).equals("Moe"));
    }

    @Test
    public void TestPut(){
        map.put(1, "Moe");
        Assert.assertFalse(map.isEmpty());
    }

    @Test
    public void TestContainsValue(){
        map.put(1,"Moe");
        Assert.assertTrue(map.containsValue("Moe"));
    }

    @Test
    public void TestContainsKey(){
        map.put(1, "Moe");
        Assert.assertTrue(map.containsKey(1));
    }

    @Test
    public void TestEntrySet(){
        map.put(1, "Moe");
        map.put(2, "Moe");
        int expected = 2;
        Assert.assertEquals(map.entrySet().size(), expected);
    }
}
