package Collections;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{
    private T[] list  = (T[]) new Object[10];
    private int count;
    private int currentSize = 10;

    private boolean isFull(){
        return count >= currentSize;
    }

    private void expand(){
        T[] temp = (T[]) new Object[2 * currentSize];
        for (int i = 0; i < currentSize; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }

    public void add(T t){
        if (!isFull())
            list[count++] = t;
        else {
            expand();
            list[count++] = t;
        }
    }

    public void remove(T t){
        int index = -1;
        for (int i = 0; i < currentSize; i++) {
            if (list[i] != null){
                if (list[i].equals(t)){
                    list[i] = null;
                    index = i;
                }
            }
        }
        for(int i = index; i < currentSize; i++){
            if (i+1 < currentSize)
                list[i] = list[i+1];
        }

        count--;
    }

    @Override
    public String toString() {
        boolean flag = false;
        String representation = "[";
        for (int i = 0; i < currentSize; i++) {
            if(list[i] == null){
                break;
            }
            else{
                if (i != 0){
                    representation += ",";
                }
                representation += list[i];
            }



        }
        representation += "]";
        return representation;
    }

    class ListIterator implements Iterator<T>{
        private GenericList<T> items;
        private int index = 0;

        ListIterator(GenericList<T> list){
            this.items = list;
        }

        @Override
        public boolean hasNext() {
            return (index < items.count);
        }

        @Override
        public T next() {
            return items.list[index++];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

}
