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

  /*  public int getArraySize() {
        return arraySize;
    } */

    public boolean add(T typeObject) {
        resize(myArray.length + 1);
        myArray[arraySize] = typeObject;
        arraySize++;
        return true;
    }

    public void add(int index, T typeObject) {
        if(index > arraySize){
            resize(index);
            arraySize = index+1;
            myArray[index] = typeObject;
        }
        else {
            arraySize++;
            T[] newArray = Arrays.copyOfRange(myArray, 0,myArray.length-1);
            myArray[index] = typeObject;
            for(int i = index; i < newArray.length;i++){
                myArray[i+1] = newArray[i];
            }

        }
    }

    public T get(int index) {
        return myArray[index];
    }

    public void remove(int index) {
        T[] newArray = Arrays.copyOfRange(myArray, 0,myArray.length-1);
        for(int i = index; i < newArray.length-1;i++){
            myArray[i] = newArray[i+1];
        }
        arraySize--;

    }

    //resizez array-javadoc
    private void resize(int index) {
        if (myArray.length < index) {
            myArray = Arrays.copyOf(myArray, index * 2);
        }
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
