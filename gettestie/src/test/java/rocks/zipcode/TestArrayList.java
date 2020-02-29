package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {

    private static ArrayList<String> stringList = new ArrayList<>();

    @Before
    public void beforeEach(){
        stringList.clear();
    }

    @Test
    public void TestGet(){
        stringList.add("Moe");
        Assert.assertTrue(stringList.get(0).equals("Moe"));
    }

    @Test
    public void TestSize(){
        // Given
        stringList.add("Moe");
        stringList.add("Aydin");
        Integer expected = 2;

        // When
        Integer actual = stringList.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestContains(){
        // Given
        stringList.add("Moe");

        // Then
        Assert.assertTrue(stringList.contains("Moe"));
        Assert.assertFalse(stringList.contains("No One!"));
    }

    @Test
    public void TestRemove(){
        // Given
        stringList.add("Moe");

        // When
        stringList.remove("Moe");

        // Then
        Assert.assertFalse(stringList.contains("Moe"));
    }

    @Test
    public void TestRemoveIndex(){
        // Given
        stringList.add("Moe");

        // When
        stringList.remove(0);

        // Then
        Assert.assertFalse(stringList.contains("Moe"));
    }


}






