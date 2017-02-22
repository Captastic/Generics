package capriotti.anthony.generics;

import java.util.Arrays;


/**
 * Created by anthonycapriotti on 2/22/17.
 */
public class MyArrayList<T> {
    private T[] myArray;
    private int arraySize;

    public MyArrayList() {
        this(10);
        arraySize = 0;
    }

    public MyArrayList(int initialCapacity) {
        myArray = (T[]) new Object[arraySize];
        arraySize = arraySize;
    }

    public boolean add(T typeObject) {
        resize(myArray.length + 1);
        myArray[arraySize] = typeObject;
        arraySize++;
        return true;
    }

    //copyOfRange arrays javadoc
    public void add(int index, T typeObject) {
        if(index > arraySize){
            resize(index);
            arraySize = index+1;
            myArray[index] = typeObject;
        }
        else {
            T[] newArray = Arrays.copyOfRange(myArray, 0,myArray.length-1);
            myArray[index] = typeObject;
            for(int i = index; i < newArray.length;i++){
                myArray[i+1] = newArray[i];
            }
        }
    }

    //resizez array-javadoc copyOf
    private void resize(int index) {
        if (myArray.length < index) {
            myArray = Arrays.copyOf(myArray, index * 2);
        }
    }

    public T get(int index) {
        return myArray[index];
    }

    public void remove(int index) {
        for(int i = index; i < myArray.length-1;i++){
            myArray[i] = myArray[i-1];
        }
        arraySize--;

    }

    //remove first instance
    public boolean remove(T object){
        for (int i = 0; i < myArray.length; i++){
            if (object.equals(myArray[i]))
                remove(i);
            return true;
        }
        return false;
    }

    //replaces element with new requested
    public void set(int index, T typeObject) {
        if(index > arraySize){
            arraySize = index+1;
        }
        myArray[index] = typeObject;
    }

    public void clear() {
        myArray = (T[]) new Object[10];
        arraySize = 0;
    }

    public boolean isEmpty() {
        if(arraySize == 0)
            return true;
        else
            return false;
    }

    public boolean contains(T typeObject) {
        for(int i = 0; i < arraySize; i++){
            if(typeObject.equals(myArray[i])){
                return true;
            }
        }
        return false;
    }

/*
    //logic needs working
    public int indexOf(T typeObject){
        for (int i = 0 ; i > arraySize; i++){
            if(equals(typeObject, myArray[i]) )
                return i;
        }
        return -1;
    }
    */

}
