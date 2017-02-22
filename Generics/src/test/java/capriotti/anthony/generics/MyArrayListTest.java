package capriotti.anthony.generics;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonycapriotti on 2/22/17.
 */
public class MyArrayListTest {
    MyArrayList<String> mal = new MyArrayList<String>();


    @Before
    public void setUp(){
        mal = new MyArrayList<>();
        mal.add(10, "10th index");
    }

    @Test
    //one parameter add end of list
    public void addOneParameterTest(){
        mal.add("11th index");
        String expected = "11th index";
        String actual = mal.get(11);
        assertEquals("11th will return", expected, actual);

    }

    @Test
    //add object to specific element
    public void addObjectToSpecificElementTest(){
        mal.add(1,"first index");
        String expected = "first index";
        String actual = mal.get(1);
        assertEquals("first index will return", expected, actual);
    }

    @Test
    //get item at specific index
    public void getTest(){
        String expected = "10th index";
        String actual = mal.get(10);
        assertEquals("10th index will return", expected, actual);
    }

    @Test
    //remove item from specified index
    public void removeTest(){
        mal.remove(10);
        String expected = null;
        String actual = mal.get(10);
        assertEquals("null will return", expected, actual);
    }

    @Test
    //remove first instance
    public void removeFirstInstance(){
        boolean expected = true;
        boolean actual = mal.remove("10th index");
        assertEquals("returns false", expected, actual);
    }

    @Test
    //replaces element with new requested
    public void setTest(){
        mal.set(10, "stuff and things");
        String expected = "stuff and things";
        String actual = mal.get(10);
        assertEquals("new 10th index returns", expected, actual);
    }

    @Test
    public void clearTest(){
        mal.clear();
        String expected = null;
        String actual = mal.get(0);
        assertEquals("null will return", expected, actual);
    }

    @Test
    //is empty true
    public void isEmptyTest(){
        mal.clear();
        boolean expected = true;
        boolean actual = mal.isEmpty();
        assertEquals("true will return", expected, actual);
    }

    @Test
    //is empty false
    public void isEmptyFalseTest(){
        boolean expected = false;
        boolean actual = mal.isEmpty();
        assertEquals("false returns array still contains elements", expected, actual);
    }

    @Test
    //contains true
    public void containsTest(){
        boolean expected = true;
        boolean actual = mal.contains("10th index");
        assertEquals("true will return does contain 10th elemetn", expected, actual);
    }

    @Test
    //contains false
    public void containsFalseTest(){
        boolean expected = false;
        boolean actual = mal.contains("9th index");
        assertEquals("false does not contain 9th elemetn", expected, actual);
    }

    /*
    @Test
    public void indexOfTest(){
        int expected = 1;
        int actual = mal.indexOf("11th will return");
        assertEquals("1 will return contains element", expected, actual);
    }
    */



}
