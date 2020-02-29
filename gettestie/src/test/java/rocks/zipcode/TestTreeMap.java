package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

public class TestTreeMap {

    TreeMap<String, Integer> map = new TreeMap<>();

    @Before
    public void beforeEach(){
        map.clear();
    }

    @Test
    public void TestGet() {
        map.put("Moe", 1);
        Assert.assertTrue(map.get("Moe") == 1);
    }

    @Test
    public void TestPut(){
        map.put("Moe", 1);
        Assert.assertFalse(map.isEmpty());
    }

    @Test
    public void TestContainsValue(){
        map.put("Moe", 1);
        Assert.assertTrue(map.containsValue(1));
    }

    @Test
    public void TestContainsKey(){
        map.put("Moe", 1);
        Assert.assertTrue(map.containsKey("Moe"));
    }

    @Test
    public void TestEntrySet(){
        map.put("Moe", 1);
        map.put("Joe", 2);
        int expected = 2;
        Assert.assertEquals(map.entrySet().size(), expected);
    }


}
