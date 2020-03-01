package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class TestComparable {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());


    @Test
    public void TestComparable(){
        ArrayList<Person> people = new ArrayList<>();
        Person person1 = new Person("Moe0", 1990 );;
        Person person2 = new Person("Moe1", 1995 );;
        Person person3 = new Person("Moe2", 2000 );;
        Person person4 = new Person("Moe3", 2012 );;

        people.add(person4);
        people.add(person3);
        people.add(person2);
        people.add(person1);

        Collections.sort(people);
    }

    @Test
    public void TestComparableForString(){
        Assert.assertTrue(0 < "Beast".compareTo("Animal"));
        Assert.assertFalse(0 > "Beast".compareTo("Animal"));
    }

    @Test
    public void TestComparableForInteger(){
        Integer one = 1;
        Integer two = 2;
        Assert.assertTrue(0 < two.compareTo(one));
        Assert.assertFalse(0 > two.compareTo(one));
    }

}
