package rocks.zipcode;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

public class TestVector {

    Vector<Integer> vector = new Vector<>();

    @Before
    public void beforeEach(){
        vector = new Vector<>();
    }

    @Test
    public void TestAdd(){
        vector.add(1);
        vector.add(2);
        Assert.assertTrue(vector.get(1) == 2);
    }

    @Test
    public void TestRemoveIndex(){
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.remove(3);
        Vector<Integer> newVector = new Vector<>();
        newVector.add(1);
        newVector.add(2);
        Assert.assertEquals(vector, newVector);
    }

}
