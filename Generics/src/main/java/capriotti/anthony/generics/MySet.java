package capriotti.anthony.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


/**
 * Created by anthonycapriotti on 2/22/17.
 */
public class MySet<T> {

    private T[] myArray;

    public MySet(){
        myArray = (T[])new Object[0];
    }


    public boolean add(T object){
        if(!contains(object)){
            myArray = Arrays.copyOf(myArray, myArray.length+1);
            myArray[myArray.length-1] = object;
            return true;
        }

        return false;
    }

    public boolean addAll(Collection collection){
        return false;
    }

    public void clear(){
        myArray = (T[]) new Object[10];
    }

    public boolean contains(T object){
        for (int i = 0; i < myArray.length; i++){
            if (object.equals(myArray[i]))
                return true;
        }
        return false;
    }

    public boolean containsAll(Collection collection){
        return false;
    }

    public boolean equals(){
        return false;
    }

    public int hashCode(){
        return 0;
    }

    public boolean isEmpty() {
        if (myArray.length == 0)
            return true;
        else
            return false;
    }

  /*
    public Iterator<T> iterator(){
        Iterator<T> iterator = new Iterator<T>() {
        return iterator;
        }
    }
    */

    public boolean remove(){
        return false;
    }

    public boolean removeAll(){
        return false;
    }
}
