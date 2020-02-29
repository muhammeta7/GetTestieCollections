package rocks.zipcode;

import org.junit.Before;

import java.util.TreeMap;

public class TestTreeMap {

    TreeMap<String, Integer> map = new TreeMap<>();

    @Before
    public void beforeEach(){
        map.clear();
    }


}
