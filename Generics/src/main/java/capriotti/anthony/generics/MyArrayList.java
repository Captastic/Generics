package capriotti.anthony.generics;

/**
 * Created by anthonycapriotti on 2/22/17.
 */
public class MyArrayList<T> {
    private T[] myArray;
    private int arraySize;
    private int counter;

    public MyArrayList(){
        this(10);
        arraySize = 0;
    }

    public MyArrayList(int index){
        myArray = (T[])new Object[arraySize];
        arraySize = arraySize;
    }

    public int getArraySize() {
        return arraySize;
    }

    public boolean add(T typeObject){
        return false;
    }

    public void add(int index, T typeObject ){}

    public T get(int index){
        return null;
    }

    public T remove(int index){ return null;}

    public T set(int index, T typeObject){ return null;}

    public void clear(){}

    public boolean isEmpty(){ return false;}

    public boolean contains(T typeObject){ return false;}


}
