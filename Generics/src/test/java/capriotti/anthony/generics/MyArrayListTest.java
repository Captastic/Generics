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
        mal = new MyArrayList<String>();
        mal.add(11, "eleven");
    }

    @Test
    //add object
    public void addObjectToArrayList(){
        mal.add("stuff");
        String expected = "stuff";
        String actual = mal.get(0);
        assertEquals("stuff will return", expected, actual);
    }

    @Test
    //add object to specific element
    public void addObjectToSpecificElementTest(){
        mal.add(1,"fist index");
        String expected = "first index";
        String actual = mal.get(1);
        assertEquals("first index will return", expected, actual);
    }

    @Test
    public void getTest(){
        int expectedArraySize = 11;
        int actualArraySize = mal.getArraySize();
        assertEquals(expectedArraySize,actualArraySize);
    }

    @Test
    public void removeTest(){
        mal.remove(11);
        String expected = null;
        String actual = mal.get(11);
        assertEquals("null will return", expected, actual);
    }

    @Test
    public void setTest(){
        mal.set(9, "ninth index");
        String expected = "ninth index";
        String actual = mal.get(9);
        assertEquals("ninth index returns", expected, actual);
    }

    @Test
    public void clearTest(){
        mal.clear();
        String expected = null;
        String actual = mal.get(0);
        assertEquals("null will return", expected, actual);
    }

    @Test
    public void isEmptyTest(){
        assertFalse(mal.isEmpty());
        mal.clear();
        assertTrue(mal.isEmpty());
    }

    @Test
    public void containsTest(){
        assertTrue(mal.contains("eleven"));
    }



}
