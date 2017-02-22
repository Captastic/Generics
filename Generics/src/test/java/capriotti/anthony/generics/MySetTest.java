package capriotti.anthony.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by anthonycapriotti on 2/22/17.
 */
public class MySetTest<T> {
    MySet<String> mySet = new MySet<>();

    @Before
    public void setup(){
        mySet = new MySet<>();
        mySet.add("stuff");

    }

    @Test
    //true
    public void addTestTrue(){
        Assert.assertTrue(mySet.add("1st thing"));
    }

    @Test
    //false
    public void addTestFalse(){
        Assert.assertFalse(mySet.add("2st thing"));

    }

    @Test
    public void addAllTest(){}

    @Test
    public void clearTest(){
       assertTrue(mySet.contains("stuff"));
       mySet.clear();
       assertFalse(mySet.contains("stuff"));
    }

    @Test
    public void containsAllTest(){}

    @Test
    public void equalsTest(){}

    @Test
    public void hashCodeTest(){}

    @Test
    //false contains items
    public void isEmptyTest(){
        boolean expected = false;
        boolean actual = mySet.isEmpty();
        assertEquals("false returns contains items", expected, actual);
    }

    @Test
    //true is empty
    public void isEmptyTestTrue(){
        boolean expected = true;
        mySet.clear();
        boolean actual = mySet.isEmpty();
        assertEquals("true is empty", expected, actual);
    }

    @Test
    public void removeTest(){}

    @Test
    public void removeAllTest(){}


}

